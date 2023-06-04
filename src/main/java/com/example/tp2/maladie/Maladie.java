package com.example.tp2.maladie;
import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="maladies")
public class Maladie {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    @Nonnull
    private String nom;

    @Column
    @Nonnull
    private String symptomes;

    // Constructeurs, getters et setters

    // ...
}
