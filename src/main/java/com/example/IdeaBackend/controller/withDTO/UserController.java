package com.example.IdeaBackend.controller.withDTO;
import com.example.IdeaBackend.dto.UserDTO;
import com.example.IdeaBackend.entity.User;
import com.example.IdeaBackend.repository.UserRepository;
import com.example.IdeaBackend.service.withDto.CommonServiceDto;
import com.example.IdeaBackend.service.withDto.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/user")
public class UserController extends AbstractDTOController<User,UserDTO> {

    @Autowired
    UserService userService;

    public UserController(CommonServiceDto<User, UserDTO> service) {
        super(service);
    }

    @RequestMapping("/search/{key}")
    public ResponseEntity<?> search(@PathVariable String key, Pageable pageable){
        return ResponseEntity.ok(userService.search(key,pageable));
    }


}
