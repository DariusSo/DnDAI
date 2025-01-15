package com.DnDA.models;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class GameState {
    private long id;
    private long gameRoomId;
    private String activePlayerName;
    private String currentLocation;
    private String gameProgress;
}
