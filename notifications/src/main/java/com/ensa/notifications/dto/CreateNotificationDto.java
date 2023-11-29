package com.ensa.notifications.dto;

import com.ensa.notifications.models.NotificationType;
import jakarta.persistence.ElementCollection;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateNotificationDto {
    private String content;
    private List<String> keywords;
    private NotificationType notificationType;
    private List<String> links;
    private String imageUrl;
}
