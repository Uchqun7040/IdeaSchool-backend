package com.example.IdeaBackend.service.withoutDto.Impl;

import com.example.IdeaBackend.entity.Room;
import com.example.IdeaBackend.repository.SubjectRepository;
import com.example.IdeaBackend.service.withoutDto.SubjectService;
import com.example.IdeaBackend.entity.Subject;
import com.example.IdeaBackend.repository.DistributedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class SubjectServiceImpl extends AbstractService<Subject> implements SubjectService {
    @Autowired
    SubjectRepository subjectRepository;

    public SubjectServiceImpl(DistributedRepository<Subject> repository) {
        super(repository);
    }

    @Override
    public Page<Subject> search(String key, Pageable pageable) {
        try{
            Long n=Long.parseLong(key);
            return subjectRepository.findAllByIdOrNameContainsIgnoreCase(n,key,pageable);
        }
        catch (Exception x) {
            return subjectRepository.findAllByIdOrNameContainsIgnoreCase((long) -1,key,pageable);
        }
    }

    @Override
    public void someChangesForCreate(Subject entity) {

    }

    @Override
    public void someChangesForUpdate(Subject entity) {

    }
}
