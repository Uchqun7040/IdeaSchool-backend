package com.example.IdeaBackend.service.withoutDto;


import com.example.IdeaBackend.entity.Lesson;
import com.example.IdeaBackend.entity.Pupil;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface LessonService extends CommonService<Lesson> {
    public Page<Lesson> search(String key, Pageable pageable);
}
