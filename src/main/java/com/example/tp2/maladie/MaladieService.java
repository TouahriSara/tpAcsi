package com.example.tp2.maladie;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class MaladieService {
    private final MaladieRepository repository;

    public MaladieResponse addmaladie(MaladieRequest request){
        var Maladies= Maladie.builder()
                .nom(request.getNom())
                .symptomes(request.getSymptomes())
                .build();
        repository.save(Maladies);
        return MaladieResponse.builder()
                .nom(request.getNom())
                .symptomes(request.getSymptomes())

                .build();
    }

   public MaladieResponse getByNameMaladie(@PathVariable String nom) {
       Optional<Maladie> optionalMaladie = repository.findByNom(nom);
       if (optionalMaladie.isPresent()){
           Maladie maladiee=optionalMaladie.get();
           return MaladieResponse.builder()
                   .nom(maladiee.getNom())
                   .symptomes(maladiee.getSymptomes())

                   .build();
       }else {
           throw new IllegalArgumentException("Maladie with ID " +nom+ " not found");
       }
    }
    public List<MaladieResponse> getAllMaladie() {
        List<Maladie> maladies = repository.findAll();
        return maladies.stream()
                .map(d -> MaladieResponse.builder()
                        .id(d.getId())
                        .nom(d.getNom())
                        .symptomes(d.getSymptomes())
                        .build())
                .collect(Collectors.toList());
    }
    public  MaladieResponse getMaladieById(@PathVariable int id){
        Optional<Maladie> optionalMaladie = repository.findById(id);
        if (optionalMaladie.isPresent()){
            Maladie maladiee=optionalMaladie.get();
            return MaladieResponse.builder()
                    .nom(maladiee.getNom())
                    .symptomes(maladiee.getSymptomes())

                    .build();
        }else {
            throw new IllegalArgumentException("Maladie with ID " +id + " not found");
        }
    }

}


