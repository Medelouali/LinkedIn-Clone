package com.ensa.messages.controllers;


import com.ensa.messages.dtos.SendMessageDto;
import com.ensa.messages.models.Conversation;
import com.ensa.messages.repos.ConversationRepo;
import com.ensa.messages.services.MessagesService;
import com.ensa.messages.models.Message;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("api/v1/conversations")
@AllArgsConstructor
public class MessagesController {
    private final MessagesService messagesService;
    private final ConversationRepo conversationRepo;

    @RequestMapping(method = RequestMethod.GET)
    public List<Conversation> getConversations(@RequestParam("userId") String userId) {
        return conversationRepo.getConversationsByUserId(userId);
    }

    @RequestMapping(method = RequestMethod.POST)
    public List<Message> sendMessage(@RequestBody() SendMessageDto msg){
        System.out.println(msg);
        return messagesService.sendMessage(msg);
    }
}