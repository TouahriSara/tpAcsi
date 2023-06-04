package com.example.tp2.user;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor

public class AuthResponse {
    private Integer idUser;

    private String message;
    private  String userName;


    private String email;

    private  String password;

    private userType  type;
}
