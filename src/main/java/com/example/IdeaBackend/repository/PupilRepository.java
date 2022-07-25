package com.example.IdeaBackend.repository;

import com.example.IdeaBackend.entity.Pupil;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PupilRepository extends DistributedRepository<Pupil>{
    public Page<Pupil> findAllByIdOrNameContainsIgnoreCaseOrSurnameContainsIgnoreCaseOrMiddleNameContainsIgnoreCaseOrPhoneNumberContainsIgnoreCase(Long id, String name, String surname, String mName, String number, Pageable pageable);
}
