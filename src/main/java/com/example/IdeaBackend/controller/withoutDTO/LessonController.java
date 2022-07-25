package com.example.IdeaBackend.controller.withoutDTO;


import com.example.IdeaBackend.service.withoutDto.CommonService;
import com.example.IdeaBackend.entity.Lesson;
import com.example.IdeaBackend.service.withoutDto.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/lesson")
public class LessonController extends AbstractController<Lesson>{
    @Autowired
    LessonService lessonService;

    public LessonController(CommonService<Lesson> service) {
        super(service);
    }


    @RequestMapping("/search/{key}")
    public ResponseEntity<?> search(@PathVariable String key, Pageable pageable){
        return ResponseEntity.ok(lessonService.search(key,pageable));
    }
}
