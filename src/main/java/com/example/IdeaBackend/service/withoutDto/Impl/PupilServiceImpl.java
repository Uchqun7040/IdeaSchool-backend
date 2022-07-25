package com.example.IdeaBackend.service.withoutDto.Impl;

import com.example.IdeaBackend.repository.PupilRepository;
import com.example.IdeaBackend.service.withoutDto.PupilService;
import com.example.IdeaBackend.entity.Pupil;
import com.example.IdeaBackend.repository.DistributedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PupilServiceImpl extends AbstractService<Pupil> implements PupilService {
    @Autowired
    PupilRepository pupilRepository;

    public PupilServiceImpl(DistributedRepository<Pupil> repository) {
        super(repository);
    }

    @Override
    public void someChangesForCreate(Pupil entity) {

    }

    @Override
    public void someChangesForUpdate(Pupil entity) {

    }

    @Override
    public Page<Pupil> search(String key,Pageable pageable) {

        try{
            Long n=Long.parseLong(key);
            return pupilRepository.findAllByIdOrNameContainsIgnoreCaseOrSurnameContainsIgnoreCaseOrMiddleNameContainsIgnoreCaseOrPhoneNumberContainsIgnoreCase(n,key,key,key,key,pageable);
        }
        catch (Exception x) {
            return pupilRepository.findAllByIdOrNameContainsIgnoreCaseOrSurnameContainsIgnoreCaseOrMiddleNameContainsIgnoreCaseOrPhoneNumberContainsIgnoreCase((long) -1,key,key,key,key,pageable);
        }
    }
}
