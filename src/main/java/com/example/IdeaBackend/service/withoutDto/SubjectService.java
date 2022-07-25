package com.example.IdeaBackend.service.withoutDto;

import com.example.IdeaBackend.entity.Room;
import com.example.IdeaBackend.entity.Subject;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface SubjectService extends CommonService<Subject>{
    public Page<Subject> search(String key, Pageable pageable);
}
