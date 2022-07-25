package com.example.IdeaBackend.service.withoutDto;

import com.example.IdeaBackend.entity.Class;
import com.example.IdeaBackend.entity.Teacher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ClassService extends CommonService<Class>{
    public Page<Class> search(String key, Pageable pageable);
}
