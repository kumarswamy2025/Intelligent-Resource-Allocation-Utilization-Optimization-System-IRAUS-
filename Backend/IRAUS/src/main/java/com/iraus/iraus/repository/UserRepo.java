package com.iraus.iraus.repository;

import com.iraus.iraus.modal.UserModal;
import lombok.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<UserModal,Integer> {

    UserModal findByEmail(String email);
}
