package com.example.hello_query_parameter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class Controller {
    @GetMapping(path = "/ciao")
    public String hello(@RequestParam(value = "nome", required = true)String nome, @RequestParam(value = "provincia", required = true) String provincia){
        return "Ciao " + nome + ", com'è il tempo in " + provincia + "?";
    }
}

//Scrivi una applicazione web Spring Boot che alla endpoint GET v1/ciao?nome=Giuseppe&provincia=Lombardia risponde con "Ciao Giuseppe, com'è il tempo in Lombardia?"
