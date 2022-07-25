package com.example.IdeaBackend.service.withoutDto;

import com.example.IdeaBackend.entity.Pupil;
import com.example.IdeaBackend.entity.Teacher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface TeacherService extends CommonService<Teacher> {
    public Page<Teacher> search(String key, Pageable pageable);
}
