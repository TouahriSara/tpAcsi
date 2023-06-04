package com.example.tp2.maladie;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;



    public interface MaladieRepository extends JpaRepository<Maladie, Integer> {
        Optional<Maladie> findByNom(String nom);
    }


