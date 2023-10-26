package com.ensa.messages;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
public interface MessagesRepo extends MongoRepository<Message, String> {
}