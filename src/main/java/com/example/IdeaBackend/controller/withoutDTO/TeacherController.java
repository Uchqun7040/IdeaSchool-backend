package com.example.IdeaBackend.controller.withoutDTO;

import com.example.IdeaBackend.service.withoutDto.CommonService;
import com.example.IdeaBackend.entity.Teacher;
import com.example.IdeaBackend.service.withoutDto.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/teacher")

public class TeacherController extends AbstractController<Teacher> {

    @Autowired
    TeacherService teacherService;

    public TeacherController(CommonService<Teacher> service ) {
        super(service);
    }

    @RequestMapping("/search/{key}")
    public ResponseEntity<?> search(@PathVariable String key, Pageable pageable){
        return ResponseEntity.ok(teacherService.search(key,pageable));
    }
}
