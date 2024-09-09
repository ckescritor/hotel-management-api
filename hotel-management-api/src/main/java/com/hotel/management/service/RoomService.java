package com.hotel.management.service;

import com.hotel.management.model.Room;
import com.hotel.management.repository.RoomRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {

    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public List<Room> findAvailableRooms() {
        return roomRepository.findAll().stream()
                             .filter(Room::getIsAvailable)
                             .toList();
    }

    public Room saveRoom(Room room) {
        return roomRepository.save(room);
    }
}
