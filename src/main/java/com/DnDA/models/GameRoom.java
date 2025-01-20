package com.DnDA.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "gamerooms")
public class GameRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "players")
    private List<Long> players;
    @Column(name = "password")
    private String password;
    @Column(name="active_player_name")
    private String activePlayerName;
    @Column(name="current_location")
    private String currentLocation;
    @Column(name="game_progress")
    private String gameProgress;
    @Column(name = "character_ids")
    private List<Long> characterIds;
}
