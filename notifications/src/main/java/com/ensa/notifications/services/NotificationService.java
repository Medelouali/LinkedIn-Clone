package com.ensa.notifications.services;

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
}
