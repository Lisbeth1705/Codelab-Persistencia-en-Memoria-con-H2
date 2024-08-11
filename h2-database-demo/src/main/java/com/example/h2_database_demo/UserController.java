package com.example.h2_database_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController  // Indica que esta clase es un controlador REST
@RequestMapping("/users")  // Mapea las solicitudes a /users a este controlador
public class UserController {

    @Autowired  // Inyección de dependencias para el repositorio
    private UserRepository userRepository;

    @GetMapping  // Maneja las solicitudes GET a /users
    public List<com.example.h2databasedemo.User> getAllUsers() {
        return userRepository.findAll();  // Devuelve todos los usuarios en la base de datos
    }

    @PostMapping  // Maneja las solicitudes POST a /users
    public com.example.h2databasedemo.User createUser(@RequestBody com.example.h2databasedemo.User user) {
        return userRepository.save(user);  // Guarda un nuevo usuario en la base de datos y lo devuelve
    }
}
