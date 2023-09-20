package com.reservation.item.service;

import com.reservation.item.model.AuthenticationResponse;
import com.reservation.item.model.LoginRequest;
import com.reservation.item.model.RegisterRequest;
import org.springframework.stereotype.Service;

@Service
public interface AuthenticationService {

    public AuthenticationResponse register(RegisterRequest request);

    public AuthenticationResponse authenticate(LoginRequest request);
}
