package com.iraus.iraus.payload.response;

import com.iraus.iraus.domain.Role;
import com.iraus.iraus.domain.UserStatus;
import com.iraus.iraus.modal.Employee;
import com.iraus.iraus.payload.DTO.UserDTO;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class SignUpResponseDTO {
    //    jwt tokem
    private String jwt;
    //   message
    private  String message;
    private Integer userId;
    private String username;
    private String password;
    private String email;
    private String phone;
    private Role role;
    private UserStatus userStatus;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime lastLogin;
}
