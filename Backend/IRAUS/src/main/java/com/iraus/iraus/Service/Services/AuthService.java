package com.iraus.iraus.Service.Services;


import com.iraus.iraus.exceptions.UserException.UserExceptions;
import com.iraus.iraus.payload.DTO.UserDTO;
import com.iraus.iraus.payload.response.AuthResponse;

public interface AuthService {

AuthResponse signup(UserDTO userDTO) throws UserExceptions;

AuthResponse login(UserDTO userDTO) throws UserExceptions;

}
