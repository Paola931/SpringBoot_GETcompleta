package com.example.hello_query_parameter;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2")
public class ControllerV2 {
    @GetMapping(path = "/ciao/{provincia}")
    public User hello(
            @PathVariable String provincia,
            @RequestParam(value = "nome", required = true)String nome){
        String saluto = "Ciao " + nome + ", com'è il tempo in " + provincia + "?";
        return new User (nome, provincia, saluto);
    }
}
//Scrivi una applicazione web Spring Boot che alla endpoint GET v2/ciao/Lombardia?nome=Giuseppe risponde con un oggetto JSON formato cosi:
//
//        {
//        "nome": "Giuseppe",
//        "provincia": "Lombardia",
//        "saluto": "Ciao Giuseppe, com'è il tempo in Lombardia?"
//        }