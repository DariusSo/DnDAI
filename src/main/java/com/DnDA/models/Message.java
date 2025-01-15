package com.DnDA.models;

import com.DnDA.enums.MessageType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="messages")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;
    @Column(name="game_room_id")
    private long gameRoomId;
    @Column(name="sender")
    private String sender;
    @Column(name="content")
    private String content;
    @Column(name="time_stamp")
    private LocalDateTime timeStamp;
    @Column(name="message_type")
    private MessageType messageType;
}
