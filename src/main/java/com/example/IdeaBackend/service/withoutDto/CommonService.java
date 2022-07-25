package com.example.IdeaBackend.service.withoutDto;

import com.example.IdeaBackend.entity.DistributedEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CommonService<ENTITY extends DistributedEntity>{
    public Page<ENTITY> getAll(Pageable pageable);
    public ENTITY create(ENTITY entity) throws Exception;
    public ENTITY update (ENTITY entity);
    public ENTITY getById(Long id);
    public boolean delete(Long id);
}
