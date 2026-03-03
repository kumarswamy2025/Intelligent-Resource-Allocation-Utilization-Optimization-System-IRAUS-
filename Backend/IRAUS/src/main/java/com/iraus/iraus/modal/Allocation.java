package com.iraus.iraus.modal;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "Allocation")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Allocation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AllocationId")
    private Integer allocationId;

    @ManyToOne
    @JoinColumn(name = "EmployeeId", nullable = false)
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "ProjectId", nullable = false)
    private Project project;

    @Column(name = "AllocatedPercent", nullable = false)
    private Integer allocatedPercent;

    @Column(name = "StartDate", nullable = false)
    private LocalDate startDate;

    @Column(name = "EndDate")
    private LocalDate endDate;

    @Column(name = "AllocationStatus", length = 50)
    private String allocationStatus;
}