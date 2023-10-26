package com.ensa.messages;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Data
@AllArgsConstructor
public class MessagesService {
    private final MessagesRepo messagesRepo;
    List<Message> getMessages() {
        return messagesRepo.findAll();
    }
}