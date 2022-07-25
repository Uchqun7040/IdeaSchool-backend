package com.example.IdeaBackend.repository;

import com.example.IdeaBackend.entity.Subject;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

@Repository

public interface SubjectRepository extends DistributedRepository<Subject> {
    public Page<Subject> findAllByIdOrNameContainsIgnoreCase(Long id, String name, Pageable pageable);
}
