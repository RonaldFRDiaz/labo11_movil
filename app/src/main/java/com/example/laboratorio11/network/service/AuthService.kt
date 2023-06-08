package com.example.laboratorio11.network.service

import android.net.wifi.hotspot2.pps.Credential.CertificateCredential
import com.example.laboratorio11.network.dto.login.LoginRequest
import com.example.laboratorio11.network.dto.login.LoginResponse
import com.example.laboratorio11.network.dto.register.RegisterRequest
import com.example.laboratorio11.network.dto.register.RegisterResponse
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthService {

    @POST("spi/auth/login")
    suspend fun login(@Body credential: LoginRequest): LoginResponse

    @POST("spi/auth/register")
    suspend fun register(@Body credential: RegisterRequest): RegisterResponse
}