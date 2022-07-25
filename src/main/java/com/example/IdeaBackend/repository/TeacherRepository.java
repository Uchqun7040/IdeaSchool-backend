package com.example.IdeaBackend.repository;


import com.example.IdeaBackend.entity.Teacher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends DistributedRepository<Teacher> {
      public Page<Teacher> findAllByIdOrNameContainsIgnoreCaseOrSurnameContainsIgnoreCaseOrMiddleNameContainsIgnoreCaseOrPhoneNumberContainsIgnoreCase(Long id, String name, String surname, String mName, String number, Pageable pageable);
}
