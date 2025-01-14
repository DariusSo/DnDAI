package com.DnDA.models;


import com.DnDA.enums.Role;
import jakarta.persistence.Entity;
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
public class Player {
    private long id;
    private String username;
    private String password;
    private List<Long> gameRoomIds;
    private Role role = Role.USER;
}
