package com.DnDA.services;

import com.DnDA.exceptions.PlayerNotFoundException;
import com.DnDA.models.Player;
import com.DnDA.repositories.PlayerRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {

    @Autowired
    PlayerRepository playerRepository;

    public void savePlayer(Player player){
        playerRepository.save(player);
    }

    public Player getPlayer(long id){
        return playerRepository.findById(id)
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
