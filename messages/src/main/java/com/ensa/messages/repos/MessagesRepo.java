package com.ensa.messages.repos;

import com.ensa.messages.models.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessagesRepo extends JpaRepository<Message, String> {
}