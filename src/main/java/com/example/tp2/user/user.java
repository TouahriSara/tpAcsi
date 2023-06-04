package com.example.tp2.user;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name="user")
public class user {
    @GeneratedValue
    @Id
    private Integer idUser;

    @Column
    @Nonnull
    private  String userName;


    @Column(unique = true)
    @Nonnull
    private String email;

    @Column
    @Nonnull
    private  String password;

    @Enumerated(EnumType.STRING)
    private userType  type;
}
