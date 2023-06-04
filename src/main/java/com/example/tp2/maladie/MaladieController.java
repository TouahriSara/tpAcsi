package com.example.tp2.maladie;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class MaladieController {
    private  final  MaladieService service;
    @CrossOrigin(origins = "http://localhost:63342")
    @PostMapping("/addMaladie")
    public ResponseEntity<MaladieResponse> addmaladie(
            @RequestBody MaladieRequest request
    ){
        return ResponseEntity.ok(service.addmaladie(request));
    }
    @CrossOrigin(origins = "http://localhost:63342")
    @GetMapping("/allMaladie")
    public ResponseEntity<List<MaladieResponse>> getAllMaladie() {
        List<MaladieResponse> maladies = service.getAllMaladie();
        return ResponseEntity.ok(maladies);
    }
    @CrossOrigin(origins = "http://localhost:63342")
    @GetMapping("/maladies/{nom}")
    public ResponseEntity<MaladieResponse> getByNAmeMaladie(@PathVariable String nom) {
        MaladieResponse maladies = service.getByNameMaladie(nom);
        return ResponseEntity.ok(maladies);
    }



    @GetMapping("/Maladie/{id}")
    public ResponseEntity<MaladieResponse> getMaladieById(@PathVariable int id){
        MaladieResponse maladiee=service.getMaladieById(id);
        return ResponseEntity.ok(maladiee);

    }
}
