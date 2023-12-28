package com.microservices.notification.service;



import com.microservices.notification.model.Notification;


import java.util.List;

public interface INotificationService {
    List<Notification> findAll();
    Notification findById(Long notificationId);
    Notification save(Notification notification);
    Notification update(Notification notification);
    void deleteById(Long notificationId);
}
