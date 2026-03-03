package com.iraus.iraus.Service.Implementation;

import com.iraus.iraus.Service.Services.AuthService;
import com.iraus.iraus.exceptions.UserException.UserExceptions;
import com.iraus.iraus.payload.DTO.UserDTO;
import com.iraus.iraus.payload.response.AuthResponse;

public class AuthServiceImplementation implements AuthService {
    @Override
    public AuthResponse signup(UserDTO userDTO) throws UserExceptions {

        return null;
    }

    @Override
    public AuthResponse login(UserDTO userDTO) throws UserExceptions {
        return null;
    }
}
