package com.DnDA.services;

import com.DnDA.exceptions.PlayerAlreadyExistsException;
import com.DnDA.exceptions.PlayerNotFoundException;
import com.DnDA.models.Player;
import com.DnDA.repositories.PlayerRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {

    @Autowired
    PlayerRepository playerRepository;
    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    public void registration(Player player){

        playerRepository.findByEmail(player.getEmail())
                .ifPresent(existingPlayer -> {
                    throw new PlayerAlreadyExistsException();
                });
        player.setRole("ROLE_USER");
        player.setPassword(bCryptPasswordEncoder.encode(player.getPassword()));
        System.out.println(player);
        playerRepository.save(player);
    }

    public Player getPlayer(long id){
        return playerRepository.findById(id)
                .orElseThrow(PlayerNotFoundException::new);
    }
    public Player getPlayer(String email){
        return playerRepository.findByEmail(email)
                .orElseThrow(PlayerNotFoundException::new);
    }

    public void updatePlayer(Player updatedPlayerData) {
        playerRepository.save(updatedPlayerData);
    }

    public void deletePlayer(long id) {
        Player player = playerRepository.findById(id)
                .orElseThrow(PlayerNotFoundException::new);
        playerRepository.delete(player);
    }

}
