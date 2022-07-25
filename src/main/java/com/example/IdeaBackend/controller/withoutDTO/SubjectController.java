package com.example.IdeaBackend.controller.withoutDTO;

import com.example.IdeaBackend.entity.Subject;
import com.example.IdeaBackend.service.withoutDto.CommonService;
import com.example.IdeaBackend.service.withoutDto.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/subject")
public class SubjectController extends AbstractController<Subject>{

    @Autowired
    SubjectService subjectService;
    public SubjectController(CommonService<Subject> service) {
        super(service);
    }

    @RequestMapping("/search/{key}")
    public ResponseEntity<?> search(@PathVariable String key, Pageable pageable){
        return ResponseEntity.ok(subjectService.search(key,pageable));
    }
}
