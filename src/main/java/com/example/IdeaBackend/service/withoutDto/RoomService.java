package com.example.IdeaBackend.service.withoutDto;

import com.example.IdeaBackend.entity.Pupil;
import com.example.IdeaBackend.entity.Room;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface RoomService extends CommonService<Room> {
    public Page<Room> search(String key, Pageable pageable);
}
