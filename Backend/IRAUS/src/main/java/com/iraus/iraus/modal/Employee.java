package com.iraus.iraus.modal;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "Employee")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EmployeeId")
    private Integer employeeId;

    @OneToOne
    @JoinColumn(name = "UserId", nullable = false, unique = true)
    private UserModal user;

    @Column(name = "EmployeeCode", nullable = false, unique = true, length = 50)
    private String employeeCode;

    @Column(name = "FirstName", nullable = false, length = 100)
    private String firstName;

    @Column(name = "LastName", length = 100)
    private String lastName;

    @Column(name = "Department", length = 100)
    private String department;

    @Column(name = "ExperienceYears", precision = 4, scale = 2)
    private Double experienceYears;

    @Column(name = "JoiningDate")
    private LocalDate joiningDate;

    @Column(name = "IsActive")
    private Boolean isActive = true;

//    @OneToMany(mappedBy = "employee")
//    private List<EmployeeSkill> employeeSkills;
//
//    @OneToMany(mappedBy = "employee")
//    private List<Certification> certifications;
//
//    @OneToMany(mappedBy = "employee")
//    private List<Allocation> allocations;
}
