package com.DnDA.services;

import com.DnDA.models.Message;
import com.DnDA.repositories.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    @Autowired
    MessageRepository messageRepository;

    public void saveMessage(Message message){
        messageRepository.save(message);
    }

    public List<Message> getMessages(long gameRoomId){
        return messageRepository.findByGameRoomId(gameRoomId);
    }

}
