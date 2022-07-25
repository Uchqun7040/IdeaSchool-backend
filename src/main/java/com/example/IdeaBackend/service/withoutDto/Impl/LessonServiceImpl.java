package com.example.IdeaBackend.service.withoutDto.Impl;

import com.example.IdeaBackend.entity.Pupil;
import com.example.IdeaBackend.repository.LessonRepository;
import com.example.IdeaBackend.service.withoutDto.LessonService;
import com.example.IdeaBackend.entity.Lesson;
import com.example.IdeaBackend.repository.DistributedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class LessonServiceImpl extends AbstractService<Lesson> implements LessonService {
    @Autowired
    LessonRepository lessonRepository;

    public LessonServiceImpl(DistributedRepository<Lesson> repository) {
        super(repository);
    }

    @Override
    public Page<Lesson> search(String key, Pageable pageable) {

        try{
            Long n=Long.parseLong(key);
            return lessonRepository.findAllByIdOrTopicContainsIgnoreCaseOrSubject_NameContainsIgnoreCaseOrRoom_NameContainsIgnoreCaseOrClas_NameContainsIgnoreCaseOrTeacher_NameContainsIgnoreCaseOrTeacher_SurnameContainsIgnoreCase(n,key,key,key,key,key,key,pageable);
        }
        catch (Exception x) {
            return lessonRepository.findAllByIdOrTopicContainsIgnoreCaseOrSubject_NameContainsIgnoreCaseOrRoom_NameContainsIgnoreCaseOrClas_NameContainsIgnoreCaseOrTeacher_NameContainsIgnoreCaseOrTeacher_SurnameContainsIgnoreCase((long)-1,key,key,key,key,key,key,pageable);
        }
    }

    @Override
    public void someChangesForCreate(Lesson entity) {

    }

    @Override
    public void someChangesForUpdate(Lesson entity) {

    }
}
