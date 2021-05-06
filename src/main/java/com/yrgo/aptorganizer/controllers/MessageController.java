package com.yrgo.aptorganizer.controllers;

import com.yrgo.aptorganizer.dao.MessageRepository;
import com.yrgo.aptorganizer.domain.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MessageController {

    @Autowired
    private MessageRepository repo;

    @GetMapping("/message/{id}")
    public Message msg(@PathVariable("id") int id){
        return repo.findById(id).get();
    }

    @GetMapping("/message/{text}")
    public Message msg(@PathVariable("txt") String txt){
        return repo.messagesInOrder(txt).get();
    }



}
