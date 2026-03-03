package com.iraus.iraus.repository;

import com.iraus.iraus.modal.UserModal;
import lombok.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserModalRepo extends JpaRepository<UserModal,Integer> {


}
