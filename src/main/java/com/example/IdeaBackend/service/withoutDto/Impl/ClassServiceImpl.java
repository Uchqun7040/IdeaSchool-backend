package com.example.IdeaBackend.service.withoutDto.Impl;

import com.example.IdeaBackend.entity.Teacher;
import com.example.IdeaBackend.repository.ClassRepository;
import com.example.IdeaBackend.service.withoutDto.ClassService;
import com.example.IdeaBackend.entity.Class;
import com.example.IdeaBackend.repository.DistributedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ClassServiceImpl extends AbstractService<Class> implements ClassService {

    @Autowired
    ClassRepository classRepository;

    @Override
    public Page<Class> search(String key, Pageable pageable) {

        try{
            Long n=Long.parseLong(key);
            return classRepository.findAllByIdOrNameContainsIgnoreCaseOrClassLeader_NameContainsIgnoreCaseOrClassLeader_SurnameContainsIgnoreCase(n,key,key,key,pageable);
        }
        catch (Exception x) {
            return classRepository.findAllByIdOrNameContainsIgnoreCaseOrClassLeader_NameContainsIgnoreCaseOrClassLeader_SurnameContainsIgnoreCase((long)-1,key,key,key,pageable);
        }
    }
    public ClassServiceImpl(DistributedRepository<Class> repository) {
        super(repository);
    }

    @Override
    public void someChangesForCreate(Class entity) {

    }

    @Override
    public void someChangesForUpdate(Class entity) {

    }
}
