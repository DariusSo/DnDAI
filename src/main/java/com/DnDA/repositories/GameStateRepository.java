package com.DnDA.repositories;

import com.DnDA.models.GameState;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameStateRepository extends JpaRepository<GameState, Integer> {
}
