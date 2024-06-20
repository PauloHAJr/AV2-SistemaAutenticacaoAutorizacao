package com.example.SistemaAutenticacaoAutorizacao.controller;
import com.example.SistemaAutenticacaoAutorizacao.model.LoginRequest;
import com.example.SistemaAutenticacaoAutorizacao.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthController {
    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {
        String token = authService.generateToken(request.getUsername());
        return token;
    }

    @GetMapping("/username/{token}")
    public String extractUsername(@PathVariable String token) {
        String username = authService.extractUsername(token);
        return username;
    }
    @Secured("ADMIN")
    @GetMapping("/admin/users")
    public String onlyAdmin(Authentication authentication) {
        return "Admin: " + authentication.getName();
    }

    @Secured("GERENTE")
    @GetMapping("/manager/products")
    public String onlyGerente(Authentication authentication) {
        return "Gerente: " + authentication.getName();
    }

    @Secured("/VENDEDOR")
    @GetMapping("/seller/orders")
    public String onlyVendedor(Authentication authentication) {
        return "Vendedor: " + authentication.getName();
    }

    @Secured("/CLIENTE")
    @GetMapping("/costumer/products")
    public String onlyCliente(Authentication authentication) {
        return "Cliente: " + authentication.getName();
    }
}
