package com.yrgo.aptorganizer.dao;

import com.yrgo.aptorganizer.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MessageRepository extends JpaRepository<Message, Integer> {

    @Query("SELECT msg FROM Message msg ORDER BY time, date")
    List<Message> messagesInOrder();

}
