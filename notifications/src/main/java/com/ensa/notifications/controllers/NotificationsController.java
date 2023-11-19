package com.ensa.notifications.controllers;

import com.ensa.notifications.services.NotificationService;
import com.ensa.notifications.models.Notification;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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


}