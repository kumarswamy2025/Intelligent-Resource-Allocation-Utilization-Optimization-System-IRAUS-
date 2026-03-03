package com.iraus.iraus.modal;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
@Entity
@Table(name = "Certification")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Certification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CertificationId")
    private Integer certificationId;

    @ManyToOne
    @JoinColumn(name = "EmployeeId", nullable = false)
    private Employee employee;

    @Column(name = "CertificationName", nullable = false, length = 200)
    private String certificationName;

    @Column(name = "IssuingAuthority", length = 200)
    private String issuingAuthority;

    @Column(name = "IssueDate")
    private LocalDate issueDate;

    @Column(name = "ExpiryDate")
    private LocalDate expiryDate;

    @Column(name = "VerificationStatus", length = 50)
    private String verificationStatus;

    @ManyToOne
    @JoinColumn(name = "VerifiedBy")
    private Employee verifiedBy;
}
