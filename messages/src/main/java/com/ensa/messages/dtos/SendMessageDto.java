package com.ensa.messages.dtos;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class SendMessageDto {
    private String senderId;
    private String receiverId;
    private String conversationId;
    private String message;
}
