package com.microservices.notification.model;

import java.time.LocalDateTime;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Notification {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id_notification;
  private String userId;
  private String message;
  private Date sentTime;

  public Long getId_notification() {
    return id_notification;
  }

  public void setId_notification(Long id_notification) {
    this.id_notification = id_notification;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Date getSentTime() {
    return sentTime;
  }

  public void setSentTime(Date sentTime) {
    this.sentTime = sentTime;
  }
}
