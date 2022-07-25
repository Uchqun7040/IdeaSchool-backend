package com.example.IdeaBackend.repository;

import com.example.IdeaBackend.entity.Class;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRepository extends DistributedRepository<Class>{
    public Page<Class> findAllByIdOrNameContainsIgnoreCaseOrClassLeader_NameContainsIgnoreCaseOrClassLeader_SurnameContainsIgnoreCase(Long id, String name, String tName, String tSurname, Pageable pageable);
}
