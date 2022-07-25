package com.example.IdeaBackend.controller.withoutDTO;


import com.example.IdeaBackend.service.withoutDto.CommonService;
import com.example.IdeaBackend.entity.Room;
import com.example.IdeaBackend.service.withoutDto.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/room")
public class RoomController extends AbstractController<Room> {

    @Autowired
    RoomService roomService;

    public RoomController(CommonService<Room> service) {
        super(service);
    }

    @RequestMapping("/search/{key}")
    public ResponseEntity<?> search(@PathVariable String key, Pageable pageable){
        return ResponseEntity.ok(roomService.search(key,pageable));
    }

}
