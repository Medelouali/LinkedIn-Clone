package com.ensa.messages.services;

import com.ensa.messages.models.Conversation;
import com.ensa.messages.repos.ConversationRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class ConversationService {
    private final ConversationRepo conversationRepo;

    public List<Conversation> getConversationsByUserId(String userId) {
        return conversationRepo.getConversationsByUserId(userId);
    }

}
