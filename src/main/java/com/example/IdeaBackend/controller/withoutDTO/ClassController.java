package com.example.IdeaBackend.controller.withoutDTO;

import com.example.IdeaBackend.service.withoutDto.ClassService;
import com.example.IdeaBackend.service.withoutDto.CommonService;
import com.example.IdeaBackend.entity.Class;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/class")
public class ClassController extends AbstractController<Class>{
    @Autowired
    ClassService classService;
    public ClassController(CommonService<Class> service) {
        super(service);
    }

    @RequestMapping("/search/{key}")
    public ResponseEntity<?> search(@PathVariable String key, Pageable pageable){
        return ResponseEntity.ok(classService.search(key,pageable));
    }
}
