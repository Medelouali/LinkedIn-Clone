package com.ensa.notifications.controllers;

import com.ensa.notifications.dto.CreateNotificationDto;
import com.ensa.notifications.services.NotificationService;
import com.ensa.notifications.models.Notification;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/notifications")
@AllArgsConstructor
public class NotificationsController {

    private final NotificationService notificationService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Notification> findAll() {
        return notificationService.getNotifications();
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Notification> createNotification(@RequestBody() CreateNotificationDto dto) {
        return ResponseEntity.ok(this.notificationService.createNotification(dto));
    }

    @RequestMapping(value = "{notificationId}", method = RequestMethod.DELETE)
    public void deleteNotification(@PathVariable() String notificationId){
        notificationService.deleteNotification(notificationId);
    }
}