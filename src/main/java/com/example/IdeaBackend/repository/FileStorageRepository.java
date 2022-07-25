package com.example.IdeaBackend.repository;

import com.example.IdeaBackend.entity.FileStatus;
import com.example.IdeaBackend.entity.FileStorage;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FileStorageRepository extends DistributedRepository<FileStorage>{
    FileStorage findByHashId(String hashId);
    List<FileStorage> findAllByStatus(FileStatus status);

}
