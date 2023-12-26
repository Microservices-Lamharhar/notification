
package com.microservices.notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * BookingRepository
 */
@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {

}
