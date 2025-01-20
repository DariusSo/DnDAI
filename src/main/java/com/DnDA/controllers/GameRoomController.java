package com.DnDA.controllers;

import com.DnDA.models.GameRoom;
import com.DnDA.services.GameRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/gameRoom")
public class GameRoomController {

    @Autowired
    GameRoomService gameRoomService;

    @PostMapping()
    public void createRoom(@RequestBody GameRoom gameRoom){
        gameRoomService.createRoom(gameRoom);
    }
    @GetMapping("/getId")
    public long getRoomId(@RequestParam String name){
        return gameRoomService.getRoomId(name);
    }


}
