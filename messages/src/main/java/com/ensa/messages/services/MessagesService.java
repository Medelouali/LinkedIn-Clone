package com.ensa.messages.services;


import com.ensa.messages.dtos.SendMessageDto;
import com.ensa.messages.models.Conversation;
import com.ensa.messages.models.Message;
import com.ensa.messages.repos.ConversationRepo;
import com.ensa.messages.repos.MessagesRepo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Data
@AllArgsConstructor
@Slf4j
public class MessagesService {
    private final MessagesRepo messagesRepo;
    private final ConversationRepo conversationRepo;
    public List<Message> getMessages() {
        return messagesRepo.findAll();
    }

    public List<Message> sendMessage(SendMessageDto msg){
        Optional<Conversation> conversationOptional = conversationRepo.findById(msg.getConversationId());

        if (conversationOptional.isPresent()) {
            log.info("Conversation already exists");
            Conversation conversation = conversationOptional.get();

            Message message = Message.builder()
                    .message(msg.getMessage())
                    .receiverId(msg.getReceiverId())
                    .senderId(msg.getSenderId())
                    .conversationId(conversation.getId())
                    .build();

            conversation.addMessage(message);

            // Save the conversation along with the new message
            conversationRepo.saveAndFlush(conversation);

            return conversation.getMessages();
        }

        log.info("New conversation");
        Conversation newConversation = Conversation.builder()
                .ownerId2(msg.getReceiverId())
                .ownerId1(msg.getSenderId())
                .build();

        Message message = Message.builder()
                .message(msg.getMessage())
                .receiverId(msg.getReceiverId())
                .senderId(msg.getSenderId())
                .conversationId(newConversation.getId())
                .build();
        newConversation.addMessage(message);

        // Save the new conversation along with the new message
        conversationRepo.saveAndFlush(newConversation);

        return newConversation.getMessages();
    }
}