package com.iraus.iraus.modal;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(
        name = "ProjectSkill",
        uniqueConstraints = @UniqueConstraint(columnNames = {"ProjectId", "SkillId"})
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProjectSkill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ProjectSkillId")
    private Integer projectSkillId;

    @ManyToOne
    @JoinColumn(name = "ProjectId", nullable = false)
    private Project project;

    @ManyToOne
    @JoinColumn(name = "SkillId", nullable = false)
    private Skill skill;

    @Column(name = "RequiredLevel", length = 50)
    private String requiredLevel;

    @Column(name = "RequiredExperienceYears", precision = 4, scale = 2)
    private Double requiredExperienceYears;
}
