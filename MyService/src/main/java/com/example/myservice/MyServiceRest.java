package com.example.myservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyServiceRest {

    @GetMapping("/")
    public String sayHello(){
        return "<h1>Test de Hello World modifié</h1><p>Bonjour</p>";
    }

}
