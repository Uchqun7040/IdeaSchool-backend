package com.example.IdeaBackend.controller.withDTO;

import com.example.IdeaBackend.dto.UserDTO;
import com.example.IdeaBackend.entity.Role;
import com.example.IdeaBackend.entity.User;
import com.example.IdeaBackend.repository.UserRepository;

import com.example.IdeaBackend.security.JwtTokenUtil;
import com.example.IdeaBackend.security.Token;
import com.example.IdeaBackend.security.UserSpecial;
import com.example.IdeaBackend.security.UserProvider;

import com.example.IdeaBackend.service.withDto.UserService;
import com.example.IdeaBackend.vm.UserVM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("api/account")
public class AccountController {
    @Autowired
    UserProvider userProvider;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    PasswordEncoder encoder;

    @PostMapping("/authenticate")
    public ResponseEntity<Token> login(@RequestBody UserSpecial userSpecial) throws Exception {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                    userSpecial.getUsername(), userSpecial.getPassword()));
        } catch (DisabledException e) {
            throw new Exception("USER_DISABLED", e);
        } catch (BadCredentialsException e) {
            throw new Exception("INVALID_CREDENTIALS", e);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        UserDetails userDetails = userProvider.loadUserByUsername(userSpecial.getUsername());
        String token = jwtTokenUtil.generateToken(userDetails, true);
        return ResponseEntity.ok(new Token(token));

    }
    @PostMapping("/register")
    public ResponseEntity<UserDTO> register(@RequestBody User user) throws Exception {
        if (user.getId() != null)
            return ResponseEntity.badRequest().build();
        return ResponseEntity.ok(userService.create(user));
    }

    @GetMapping()
    public ResponseEntity<UserDTO> getCurrentUser(){
        return ResponseEntity.ok(userService.getCurrentUser());
    }


    @PutMapping("/password")
    public ResponseEntity<?> updatePassword(@RequestBody UserVM vm) {


        if(userService.changePassword(vm)){

            return ResponseEntity.noContent().build();

        }
        return  ResponseEntity.badRequest().build();
    }
}
