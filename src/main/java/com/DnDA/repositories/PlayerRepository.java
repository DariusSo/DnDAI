package com.DnDA.repositories;

import com.DnDA.models.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {

    @Query(value = "SELECT * FROM players WHERE email = ?1", nativeQuery = true)
    Optional<Player> findByEmail(String email);

}
