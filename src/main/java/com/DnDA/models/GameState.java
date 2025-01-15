package com.DnDA.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="game_state")
public class GameState {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;
    @Column(name="game_room_id")
    private long gameRoomId;
    @Column(name="active_player_name")
    private String activePlayerName;
    @Column(name="current_location")
    private String currentLocation;
    @Column(name="game_progress")
    private String gameProgress;
}
