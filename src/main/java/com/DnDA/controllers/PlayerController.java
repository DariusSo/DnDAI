package com.DnDA.controllers;

import com.DnDA.models.Player;
import com.DnDA.security.TokenService;
import com.DnDA.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/player")
public class PlayerController {

    @Autowired
    PlayerService playerService;
    @Autowired
    AuthenticationManager authenticationManager;
    @Autowired
    TokenService tokenService;

    @PostMapping
    public void registration(@RequestBody Player player){
        playerService.registration(player);
    }

    @GetMapping("/login")
    public String login(@RequestParam String email, @RequestParam String password){
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(email, password));
        long userId = playerService.getPlayer(email).getId();
        return tokenService.getToken(authentication, userId);
    }

    @GetMapping
    public Player getPlayerById(@RequestParam long id){
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
