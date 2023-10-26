package com.ensa.notifications;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class NotificationService {
    private final NotificationRepo notificationRepo;

    public Notification save(Notification notification) {
        return notificationRepo.save(notification);
    }

    public void delete(Notification notification) {
        notificationRepo.delete(notification);
    }

    public Iterable<Notification> findAll() {
        return notificationRepo.findAll();
    }

    public Notification findById(String id) {
        return notificationRepo.findById(id).get();
    }

    public void deleteById(String id) {
        notificationRepo.deleteById(id);
    }

    public Notification update(Notification notification) {
        return notificationRepo.save(notification);
    }

}
