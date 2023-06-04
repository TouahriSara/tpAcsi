package com.example.tp2.user;
import com.example.tp2.user.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import com.example.tp2.user.AuthResponse;
import com.example.tp2.user.AuthRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class AuthControle {
    private final AuthService service;
    @CrossOrigin(origins = "http://localhost:63342")
    @PostMapping("/singup")
    public ResponseEntity<AuthResponse> registerUser(
            @RequestBody AuthRequest request
    ){
        return ResponseEntity.ok(service.register(request));
    }
    @CrossOrigin(origins = "http://localhost:63342")
    @PostMapping("/login")
    public ResponseEntity<AuthResponse> loginUser(
            @RequestBody AuthRequest request
    ){
        return ResponseEntity.ok(service.Login(request));
    }


}
