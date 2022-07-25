package com.example.IdeaBackend.repository;

import com.example.IdeaBackend.entity.Room;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends DistributedRepository<Room> {

    public Page<Room> findAllByIdOrNameContainsIgnoreCase(Long id, String name, Pageable pageable);

}
