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
public class Item {
    private long id;
    private String name;
    private String type;
    private String rarity;
    private String effects;
    private long ownerId;
}
