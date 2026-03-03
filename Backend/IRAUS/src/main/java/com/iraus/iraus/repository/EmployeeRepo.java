package com.iraus.iraus.repository;

import com.iraus.iraus.modal.Allocation;
import com.iraus.iraus.modal.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
}
