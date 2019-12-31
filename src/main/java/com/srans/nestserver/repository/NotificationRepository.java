package com.srans.nestserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.srans.nestserver.model.Notification;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {

}
