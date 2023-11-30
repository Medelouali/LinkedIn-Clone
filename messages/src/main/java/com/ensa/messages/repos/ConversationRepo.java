package com.ensa.messages.repos;

import com.ensa.messages.models.Conversation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConversationRepo extends JpaRepository<Conversation, String> {
    @Query("SELECT c FROM Conversation c WHERE c.ownerId1 = :userId OR c.ownerId2 = :userId")
    List<Conversation> getConversationsByUserId(@Param("userId") String userId);
}
