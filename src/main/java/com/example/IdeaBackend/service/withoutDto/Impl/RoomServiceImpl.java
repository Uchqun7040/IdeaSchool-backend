package com.example.IdeaBackend.service.withoutDto.Impl;

import com.example.IdeaBackend.repository.RoomRepository;
import com.example.IdeaBackend.service.withoutDto.RoomService;
import com.example.IdeaBackend.entity.Room;
import com.example.IdeaBackend.repository.DistributedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class RoomServiceImpl extends AbstractService<Room> implements RoomService {
    @Autowired
    RoomRepository roomRepository;

    public RoomServiceImpl(DistributedRepository<Room> repository) {
        super(repository);
    }

    @Override
    public void someChangesForCreate(Room entity) {

    }

    @Override
    public void someChangesForUpdate(Room entity) {

    }

    @Override
    public Page<Room> search(String key, Pageable pageable) {
        try{
            Long n=Long.parseLong(key);
            return roomRepository.findAllByIdOrNameContainsIgnoreCase(n,key,pageable);
        }
        catch (Exception x) {
            return roomRepository.findAllByIdOrNameContainsIgnoreCase((long) -1,key,pageable);
        }
    }
}
