package com.iraus.iraus.modal;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@Table(name = "Notification")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "NotificationId")
    private Integer notificationId;

    @ManyToOne
    @JoinColumn(name = "UserId", nullable = false)
    private UserModal user;

    @Column(name = "Message", length = 500)
    private String message;

    @Column(name = "IsRead")
    private Boolean isRead = false;

    @Column(name = "CreatedDate")
    private LocalDateTime createdDate;
}
