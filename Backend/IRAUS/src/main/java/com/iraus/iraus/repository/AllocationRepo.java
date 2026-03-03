package com.iraus.iraus.repository;

import com.iraus.iraus.modal.Allocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface AllocationRepo extends JpaRepository<Allocation,Integer> {
}
