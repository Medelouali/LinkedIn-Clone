package com.ensa.notifications.services;

import com.ensa.notifications.dto.CreateNotificationDto;
import com.ensa.notifications.models.Notification;
import com.ensa.notifications.repos.NotificationRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class NotificationService {
    private final NotificationRepo notificationRepo;

    public List<Notification> getNotifications() {
        return notificationRepo.findAll();
    }

    public Notification createNotification(CreateNotificationDto dto) {
        Notification notification = Notification.builder()
                .content(dto.getContent())
                .notificationType(dto.getNotificationType())
                .links(dto.getLinks())
                .keywords(dto.getKeywords())
                .imageUrl(dto.getImageUrl())
                .build();
        notificationRepo.saveAndFlush(notification);
        return  notification;
    }

    public void deleteNotification(String notificationId){
        notificationRepo.deleteById(notificationId);
    }
}
