package com.iraus.iraus.payload.DTO;



import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.*;

import javax.management.relation.Role;
import java.time.LocalDateTime;

@Data
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private Long id;
    private String fullName;
    private String email;
    private String phone;
    private Role role;
    private String password;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime lastLogin;



}
