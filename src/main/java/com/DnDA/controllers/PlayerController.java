package com.DnDA.controllers;

import com.DnDA.models.Player;
import com.DnDA.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/player")
public class PlayerController {

    @Autowired
    PlayerService playerService;

    @PostMapping
    public void savePlayer(@RequestBody Player player){
        playerService.savePlayer(player);
    }

    @GetMapping
    public Player getPlayerNyId(@RequestParam long id){
        return playerService.getPlayer(id);
    }

    @PutMapping
    public void updatePlayer(@RequestBody Player player){
        playerService.updatePlayer(player);
    }

    @DeleteMapping
    public void deletePlayer(@RequestParam long id){
        playerService.deletePlayer(id);
    }

}
