package com.example.IdeaBackend.controller.withoutDTO;

import com.example.IdeaBackend.service.withoutDto.CommonService;
import com.example.IdeaBackend.entity.Pupil;
import com.example.IdeaBackend.service.withoutDto.PupilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/pupil")
public class PupilController extends AbstractController<Pupil>{
    @Autowired
    PupilService pupilService;
    public PupilController(CommonService<Pupil> service) {
        super(service);
    }

    @RequestMapping("/search/{key}")
    public ResponseEntity<?> search(@PathVariable String key, Pageable pageable){
        return ResponseEntity.ok(pupilService.search(key,pageable));
    }
}
