package com.example.IdeaBackend.service.withoutDto.Impl;

import com.example.IdeaBackend.entity.Pupil;
import com.example.IdeaBackend.repository.TeacherRepository;
import com.example.IdeaBackend.service.withoutDto.TeacherService;
import com.example.IdeaBackend.entity.Teacher;
import com.example.IdeaBackend.repository.DistributedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl extends AbstractService<Teacher> implements TeacherService {

    @Autowired
    TeacherRepository teacherRepository;

    public TeacherServiceImpl(DistributedRepository<Teacher> repository) {
        super(repository);
    }

    @Override
    public Page<Teacher> search(String key, Pageable pageable) {

        try{
            Long n=Long.parseLong(key);
            return teacherRepository.findAllByIdOrNameContainsIgnoreCaseOrSurnameContainsIgnoreCaseOrMiddleNameContainsIgnoreCaseOrPhoneNumberContainsIgnoreCase(n,key,key,key,key,pageable);
        }
        catch (Exception x) {
            return teacherRepository.findAllByIdOrNameContainsIgnoreCaseOrSurnameContainsIgnoreCaseOrMiddleNameContainsIgnoreCaseOrPhoneNumberContainsIgnoreCase((long) -1,key,key,key,key,pageable);
        }
    }
    @Override
    public void someChangesForCreate(Teacher entity) {

    }

    @Override
    public void someChangesForUpdate(Teacher entity) {

    }
}
