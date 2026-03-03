package com.iraus.iraus.Service.Implementation;

import com.iraus.iraus.Service.Services.AuthService;
import com.iraus.iraus.configuration.jwtConfig.JwtProvider;
import com.iraus.iraus.exceptions.UserException.UserExceptions;
import com.iraus.iraus.modal.UserModal;
import com.iraus.iraus.payload.DTO.UserDTO;
import com.iraus.iraus.payload.request.SignUpRequestDTO;
import com.iraus.iraus.payload.response.AuthResponse;
import com.iraus.iraus.payload.response.SignUpResponseDTO;
import com.iraus.iraus.repository.UserModalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class AuthServiceImplementation implements AuthService {

    @Autowired
    private UserModalRepo userRepo;  // here automatically injects required dependency it can be done by lombok
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private JwtProvider jwtProvider;

    @Override
    public SignUpResponseDTO signup(SignUpRequestDTO signUpDTO) throws UserExceptions {
//        here we check if email is already exits or not
//        here we check if email is already exits or not
        UserModal checkingEmail = userRepo.findByEmail(signUpDTO.getEmail());
        if (checkingEmail != null) {
            throw new UserExceptions("email is already exits..", HttpStatus.CONFLICT);
        }


//        creating new user
// here iam using builder patterns to make objects simple
        UserModal newUser = UserModal.builder().username(signUpDTO.getUsername()).password(passwordEncoder.encode(signUpDTO.getPassword())).email(signUpDTO.getPassword()).phone(signUpDTO.getPhone()).build();
        //        System.out.println("new user Data:"+newUser);
//        save user
        UserModal savedUser = userRepo.save(newUser);


//        creating authentication object
        Authentication authentication = new UsernamePasswordAuthenticationToken(signUpDTO.getEmail(), signUpDTO.getPassword());
// tested successfully
//        System.out.println("authentication objecte:"+authentication);
// save authetication object in, to security context holder
        SecurityContextHolder.getContext().setAuthentication(authentication);

//        here we generate jwt token for who newly register

        String jwtToken = jwtProvider.generateToken(authentication);


//        signup dto object
        SignUpResponseDTO response=SignUpResponseDTO.builder()
                .jwt(jwtToken)
                .message("Registered successfully...")
                .userId(newUser.getUserId())
                .username(newUser.getUsername())
                .email(newUser.getEmail())
                .phone(newUser.getPhone())
                .role(newUser.getRole())
                .userStatus(newUser.getUserStatus())
                .createdAt(newUser.getCreatedAt())
                .updatedAt(newUser.getUpdatedAt())
                .lastLogin(newUser.getLastLogin())
                .build();

        return response;
    }

    @Override
    public AuthResponse login(UserDTO userDTO) throws UserExceptions {
        return null;
    }
}
