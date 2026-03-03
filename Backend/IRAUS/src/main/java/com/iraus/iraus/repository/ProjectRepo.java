package com.iraus.iraus.repository;

import com.iraus.iraus.modal.Project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProjectRepo extends JpaRepository<Project,Integer> {
}
