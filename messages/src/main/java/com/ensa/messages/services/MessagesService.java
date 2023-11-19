package com.ensa.messages.services;


import com.ensa.messages.models.Message;
import com.ensa.messages.repos.MessagesRepo;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Data
@AllArgsConstructor
public class MessagesService {
    private final MessagesRepo messagesRepo;
    public List<Message> getMessages() {
        return messagesRepo.findAll();
    }
}