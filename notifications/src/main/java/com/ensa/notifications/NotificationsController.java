package com.ensa.notifications;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/notifications")
@AllArgsConstructor
public class NotificationsController {

    private final NotificationService notificationService;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Notification> findAll() {
        return notificationService.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Notification findById(@PathVariable String id) {
        return notificationService.findById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Notification save(Notification notification) {
        return notificationService.save(notification);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Notification update(@PathVariable String id, Notification notification) {
        return notificationService.update(notification);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable String id) {
        notificationService.deleteById(id);
    }
}