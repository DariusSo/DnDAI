package com.DnDA.repositories;

import com.DnDA.models.GameRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GameRoomRepository extends JpaRepository<GameRoom, Long> {

    Optional<GameRoom> findByName(String name);

}
