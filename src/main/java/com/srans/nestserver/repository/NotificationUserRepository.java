package com.srans.nestserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.srans.nestserver.model.NotificationUser;

@Repository
public interface NotificationUserRepository extends JpaRepository<NotificationUser, Long> {

}
