package com.iraus.iraus.modal;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "EmployeeSkill",
        uniqueConstraints = @UniqueConstraint(columnNames = {"EmployeeId","SkillId"}))
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeSkill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EmployeeSkillId")
    private Integer employeeSkillId;

    @ManyToOne
    @JoinColumn(name = "EmployeeId", nullable = false)
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "SkillId", nullable = false)
    private Skill skill;

    @Column(name = "ProficiencyLevel", length = 50)
    private String proficiencyLevel;

    @Column(name = "YearsOfExperience")
    private Double yearsOfExperience;

    @Column(name = "LastUpdated")
    private LocalDateTime lastUpdated;
}
