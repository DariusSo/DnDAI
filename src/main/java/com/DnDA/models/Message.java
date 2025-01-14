package com.DnDA.models;

import com.DnDA.enums.MessageType;
import jakarta.persistence.Entity;
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
public class Message {
    private long id;
    private long gameRoomId;
    private String senderId;
    private String content;
    private LocalDateTime timeStamp;
    private MessageType messageType;
}
