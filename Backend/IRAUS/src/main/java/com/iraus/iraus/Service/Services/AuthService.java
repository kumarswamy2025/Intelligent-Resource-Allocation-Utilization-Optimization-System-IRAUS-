package com.iraus.iraus.Service.Services;


import com.iraus.iraus.exceptions.UserException.UserExceptions;
import com.iraus.iraus.payload.DTO.UserDTO;
import com.iraus.iraus.payload.request.SignUpRequestDTO;
import com.iraus.iraus.payload.response.AuthResponse;
import com.iraus.iraus.payload.response.SignUpResponseDTO;


public interface AuthService {

    SignUpResponseDTO signup(SignUpRequestDTO SignUpDTO) throws UserExceptions;

    AuthResponse login(UserDTO userDTO) throws UserExceptions;

}
