package com.microservices.notification.service.impl;

import com.microservices.notification.model.Notification;
import com.microservices.notification.repository.NotificationRepository;
import com.microservices.notification.service.INotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationServiceImpl implements INotificationService {
    @Autowired
    private NotificationRepository notificationRepository;

    @Override
    public List<Notification> findAll() {
        return notificationRepository.findAll();
    }

    @Override
    public Notification findById(Long notificationId) {
        return notificationRepository.findById(notificationId).orElseThrow();
    }

    @Override
    public Notification save(Notification notification) {
        return notificationRepository.save(notification);
    }

    @Override
    public Notification update(Notification notification) {
        return notificationRepository.save(notification);
    }

    @Override
    public void deleteById(Long notificationId) {
        notificationRepository.deleteById(notificationId);
    }
}
