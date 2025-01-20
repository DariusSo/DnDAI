package com.DnDA.services;

import com.DnDA.exceptions.GameRoomNotFoundException;
import com.DnDA.exceptions.PlayerDoesntBelongInThisRoomException;
import com.DnDA.models.GameRoom;
import com.DnDA.repositories.GameRoomRepository;
import com.DnDA.security.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameRoomService {

    @Autowired
    GameRoomRepository gameRoomRepository;
    @Autowired
    TokenService tokenService;

    public void createRoom(GameRoom gameRoom){
        //Check if game room with same name doesn't exist
        gameRoomRepository.findByName(gameRoom.getName()).orElseThrow(GameRoomNotFoundException::new);
        gameRoomRepository.save(gameRoom);
    }
    public GameRoom getRoom(String name){
        long userId = tokenService.getUserIdFromSecurityContext();
        GameRoom gameRoom = gameRoomRepository.findByName(name).orElseThrow(GameRoomNotFoundException::new);
        List<Long> playerInGameRoom = gameRoom.getPlayers();
        if(!playerInGameRoom.contains(userId)){
            throw new PlayerDoesntBelongInThisRoomException();
        }
        return gameRoom;
    }
    public long getRoomId(String name){
        long userId = tokenService.getUserIdFromSecurityContext();
        GameRoom gameRoom = gameRoomRepository.findByName(name).orElseThrow(GameRoomNotFoundException::new);
        List<Long> playerInGameRoom = gameRoom.getPlayers();
        if(!playerInGameRoom.contains(userId)){
            throw new PlayerDoesntBelongInThisRoomException();
        }
        return gameRoom.getId();
    }

}
