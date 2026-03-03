package com.iraus.iraus.modal;

import com.iraus.iraus.domain.Role;

import com.iraus.iraus.domain.UserStatus;
import jakarta.persistence.*;
import lombok.*;
import org.jspecify.annotations.Nullable;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class UserModal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer userId;  // no need to pass because it will automaticaly assigned


    @Column(name = "Username", nullable = false, length = 100)
    private String username;
    @Column(name = "Password", nullable = false, length = 255)
    private String password;
    @Column(name = "Email", nullable = false, unique = true, length = 150)
    private String email;
    private String phone;
    @OneToOne(mappedBy = "user")
    private Employee employee;
    @OneToMany(mappedBy = "user")
    private List<Notification> notifications;

//    Note: no need to pass below values by deafuylt it assigned
    @Enumerated(EnumType.STRING)
    @Column(name = "Role", nullable = false, length = 20)
    private Role role;  // default no role is assigned
    private UserStatus userStatus; // default status is pending wait admin to approve
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime lastLogin;
    // Runs ONLY when new user is inserted
    @PrePersist
    protected void onCreate() {

        this.createdAt = LocalDateTime.now();

//        when new user creates then user status is pending
        this.userStatus = UserStatus.PENDING;

        // set default role only if not provided
        if (this.role == null) {
            this.role = Role.NO_ROLE;   // default role
        }
    }

    // Runs EVERY TIME when user is updated
    @PreUpdate
    protected void onUpdate() {

        this.updatedAt = LocalDateTime.now();

        // Example: If role is null accidentally during update
//        if (this.role == null) {
//            this.role = UserRole.NO_ROLE;
//        }
    }
}
