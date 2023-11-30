package com.ensa.messages.services;


import com.ensa.messages.dtos.SendMessageDto;
import com.ensa.messages.models.Conversation;
import com.ensa.messages.models.Message;
import com.ensa.messages.repos.ConversationRepo;
import com.ensa.messages.repos.MessagesRepo;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Data
@AllArgsConstructor
public class MessagesService {
    private final MessagesRepo messagesRepo;
    private final ConversationRepo conversationRepo;
    public List<Message> getMessages() {
        return messagesRepo.findAll();
    }

    public List<Message> sendMessage(SendMessageDto msg){
        Optional<Conversation> conversation = conversationRepo.findById(msg.getConversationId());
        // Check if there is already a conversation in place
        if(conversation.isPresent()){
            Message message=Message.builder()
                    .message(msg.getMessage())
                    .receiverId(msg.getReceiverId())
                    .senderId(msg.getSenderId())
                    .conversationId(msg.getConversationId())
                    .build();
            conversation.get().addMessage(message);
            conversationRepo.saveAndFlush(conversation.get());
            return conversation.get().getMessages();
        }
        Conversation conversation1=Conversation.builder()
                .ownerId1(msg.getReceiverId())
                .ownerId2(msg.getReceiverId())
                .build();
        conversationRepo.saveAndFlush(conversation1);
        Message message=Message.builder()
                .message(msg.getMessage())
                .receiverId(msg.getReceiverId())
                .senderId(msg.getSenderId())
                .conversationId(conversation1.getId())
                .build();
        messagesRepo.saveAndFlush(message);
        conversation1.addMessage(message);
        conversationRepo.saveAndFlush(conversation1);
        return conversation1.getMessages();
    }
}