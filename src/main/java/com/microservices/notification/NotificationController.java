package com.microservices.notification;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notifications")
public class NotificationController {
  private final List<Notification> notifications = new ArrayList<>();

  @PostMapping
  public ResponseEntity<String> sendNotification(@RequestBody Notification notification) {
    // Validate notification, send message, etc.
    notifications.add(notification);
    return ResponseEntity.ok("Notification sent successfully!");
  }

  @GetMapping("/{id}")
  public ResponseEntity<Notification> getNotificationById(@PathVariable Long id) {
    Optional<Notification> notification = notifications.stream().filter(n -> n.getId_notification().equals(id))
        .findFirst();
    return notification.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<String> deleteNotification(@PathVariable Long id) {
    notifications.removeIf(notification -> notification.getId_notification().equals(id));
    return ResponseEntity.ok("Notification deleted successfully!");
  }
}
