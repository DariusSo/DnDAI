package com.DnDA.controllers;

import com.DnDA.models.Message;
import com.DnDA.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/message")
public class MessageController {

    @Autowired
    MessageService messageService;

    @GetMapping
    public List<Message> getMessages(@RequestParam long gameRoomId){
        return messageService.getMessages(gameRoomId);
    }

}
