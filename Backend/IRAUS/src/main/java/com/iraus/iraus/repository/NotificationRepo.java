package com.iraus.iraus.repository;

import com.iraus.iraus.modal.Allocation;
import com.iraus.iraus.modal.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepo extends JpaRepository<Notification,Integer> {
}
