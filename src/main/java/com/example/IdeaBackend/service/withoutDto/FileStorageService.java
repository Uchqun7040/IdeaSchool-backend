package com.example.IdeaBackend.service.withoutDto;

import com.example.IdeaBackend.entity.FileStorage;
import org.springframework.web.multipart.MultipartFile;

public interface FileStorageService {

    public String save(MultipartFile multiFile);

    public FileStorage findByHashId(String hashId);

    public void delete(String hashId);

    public String ext(String fullName);
}
