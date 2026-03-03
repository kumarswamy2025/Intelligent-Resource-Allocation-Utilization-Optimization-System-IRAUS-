package com.iraus.iraus.modal;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "Interview")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Interview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "InterviewId")
    private Integer interviewId;

    @ManyToOne
    @JoinColumn(name = "EmployeeId", nullable = false)
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "ProjectId", nullable = false)
    private Project project;

    @Column(name = "ScheduledDate")
    private LocalDateTime scheduledDate;

    @Column(name = "InterviewStatus", length = 50)
    private String interviewStatus;

    @Column(name = "Remarks", length = 500)
    private String remarks;

    @ManyToOne
    @JoinColumn(name = "ConductedBy", nullable = false)
    private Employee conductedBy;
}
