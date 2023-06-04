package com.example.tp2.maladie;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MaladieResponse {
    private Integer id;
    private String nom;
    private  String symptomes;
}
