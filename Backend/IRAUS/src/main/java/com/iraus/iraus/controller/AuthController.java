package com.iraus.iraus.controller;

import com.iraus.iraus.Service.Services.AuthService;
import com.iraus.iraus.exceptions.UserException.UserExceptions;
import com.iraus.iraus.payload.request.SignUpRequestDTO;
import com.iraus.iraus.payload.response.SignUpResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;
    @PostMapping("/signup")
    public ResponseEntity<SignUpResponseDTO> signupHandler(@RequestBody SignUpRequestDTO signUpRequestDTO) throws UserExceptions {

        return  ResponseEntity.ok(authService.signup(signUpRequestDTO));
    }


}
