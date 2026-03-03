package com.iraus.iraus.repository;

import com.iraus.iraus.modal.Allocation;
import com.iraus.iraus.modal.Interview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface InterviewRepo extends JpaRepository<Interview,Integer> {
}
