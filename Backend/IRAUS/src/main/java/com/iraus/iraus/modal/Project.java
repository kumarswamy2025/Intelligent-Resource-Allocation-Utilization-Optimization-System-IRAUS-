package com.iraus.iraus.modal;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "Project")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ProjectId")
    private Integer projectId;

    @Column(name = "ProjectName", nullable = false, length = 200)
    private String projectName;

    @Column(name = "ClientName", length = 200)
    private String clientName;

    @Column(name = "StartDate")
    private LocalDate startDate;

    @Column(name = "EndDate")
    private LocalDate endDate;

    @Column(name = "RequiredUtilizationPercent")
    private Integer requiredUtilizationPercent;

    @ManyToOne
    @JoinColumn(name = "CreatedBy", nullable = false)
    private Employee createdBy;

    @Column(name = "Status", length = 50)
    private String status;

    @OneToMany(mappedBy = "project")
    private List<ProjectSkill> projectSkills;

    @OneToMany(mappedBy = "project")
    private List<Allocation> allocations;
}
