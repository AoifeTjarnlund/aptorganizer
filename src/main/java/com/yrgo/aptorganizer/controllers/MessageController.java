package com.yrgo.aptorganizer.controllers;

import com.yrgo.aptorganizer.dao.MessageRepository;
import com.yrgo.aptorganizer.domain.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class MessageController {

    @Autowired
    private MessageRepository repo;

    @GetMapping("/message/all")
    public List<Message> msg(){
        return repo.messagesInOrder();
    }

}
