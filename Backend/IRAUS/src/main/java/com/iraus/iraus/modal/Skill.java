package com.iraus.iraus.modal;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "Skill")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SkillId")
    private Integer skillId;

    @Column(name = "SkillName", nullable = false, unique = true, length = 100)
    private String skillName;

    @Column(name = "SkillCategory", length = 100)
    private String skillCategory;

    @Column(name = "IsActive")
    private Boolean isActive = true;

//    @OneToMany(mappedBy = "skill")
    private List<EmployeeSkill> employeeSkills;

    @OneToMany(mappedBy = "skill")
    private List<ProjectSkill> projectSkills;
}