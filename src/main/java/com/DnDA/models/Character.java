package com.DnDA.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="characters")
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;
    @Column(name="name")
    private String name;
    @Column(name="class_type")
    private String classType;
    @Column(name="level")
    private String level;
    @Column(name="strength")
    private int strength;
    @Column(name="dexterity")
    private int dexterity;
    @Column(name="constitution")
    private int constitution;
    @Column(name="intelligence")
    private int intelligence;
    @Column(name="wisdowm")
    private int wisdom;
    @Column(name="charisma")
    private int charisma;
    @Column(name="inventory")
    private List<Long> inventory;
    @Column(name="status")
    private String status;
    @Column(name="image")
    private String image;
    @Column(name="player_id")
    private long playerId;
}
