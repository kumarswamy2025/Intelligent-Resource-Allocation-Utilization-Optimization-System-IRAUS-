package com.iraus.iraus.repository;

import com.iraus.iraus.modal.Allocation;
import com.iraus.iraus.modal.Certification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CertificateRepo extends JpaRepository<Certification,Integer> {
}
