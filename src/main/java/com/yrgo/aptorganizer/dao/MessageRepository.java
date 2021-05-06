package com.yrgo.aptorganizer.dao;

import com.yrgo.aptorganizer.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MessageRepository extends JpaRepository<Message, String> {

    @Query("SELECT msg FROM appointment ORDER BY timeOfMeeting, date")
    List<Message> messagesInOrder();

    @Query("SELECT id FROM appointment")
    List<Message> findById();

}
