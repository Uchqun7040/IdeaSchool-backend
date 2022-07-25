package com.example.IdeaBackend.service.withoutDto;

import com.example.IdeaBackend.entity.Pupil;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PupilService extends CommonService<Pupil>{
    public Page<Pupil> search(String key, Pageable pageable);
}
