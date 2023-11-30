package com.ensa.messages.dtos;

import lombok.*;

@Data
public class SendMessageDto {
    private String senderId;
    private String receiverId;
    private String conversationId;
    private String message;

    @Override
    public String toString() {
        return "SendMessageDto{" +
                "senderId='" + senderId + '\'' +
                ", receiverId='" + receiverId + '\'' +
                ", conversationId='" + conversationId + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
