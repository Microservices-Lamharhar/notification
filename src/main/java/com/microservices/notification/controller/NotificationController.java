package com.microservices.notification.controller;




import com.microservices.notification.model.Notification;
import com.microservices.notification.service.INotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notifications")
public class NotificationController {
  @Autowired
  private INotificationService notificationService;

  @GetMapping("")
  public ResponseEntity<?> getAllNotifications() {
    return new ResponseEntity<>(notificationService.findAll(), HttpStatus.OK);
  }

  @PostMapping("/save")
  public ResponseEntity<?> addNotification(@RequestBody Notification notification) {
    // Assigning ID (for demo purposes)
    var savedPayment = notificationService.save(notification);

    return new ResponseEntity<>(savedPayment, HttpStatus.OK);
  }

  @GetMapping("/get/{id}")
  public ResponseEntity<?> getNotificationById(@PathVariable Long id) {
    return new ResponseEntity<>(notificationService.findById(id), HttpStatus.OK);
  }

  @PutMapping("/update")
  public ResponseEntity<?> updateNotification(@RequestBody Notification updatedNotification) {
    return new ResponseEntity<>(notificationService.update(updatedNotification), HttpStatus.OK);
  }

  @DeleteMapping("/delete/{id}")
  public ResponseEntity<String> deleteNotification(@PathVariable Long id) {
    // update car availability
    // interaction with car service
    notificationService.deleteById(id);
    return ResponseEntity.ok("User deleted successfully!");
  }
}
