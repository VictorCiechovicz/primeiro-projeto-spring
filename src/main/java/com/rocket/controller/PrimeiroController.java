package com.rocket.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/primeiroController")
public class PrimeiroController {

    @GetMapping("/primeiroMetodo/{id}")
    public String primeiroMetodo(@PathVariable String id) {
        return "o parametro é " + id;
    }

    @GetMapping("/metotoQueryParms")
    public String metotoQueryParms(@RequestParam String id) {
        return "o parametro é " + id;
    }

    //forma de passar varios parametros e mapear eles atraves do Map
    @GetMapping("/metotoListQueryParms2")
    public String metotoListQueryParms(@RequestParam Map<String, String> allParams) {
        return "o parametro é " + allParams.entrySet();
    }


    //recurso do spring para criar uma classe sem setters e getters
    record Usuario(String name, String email) {
    }

    @PostMapping("/metodoBodyParams")
    public String metodoBodyParams(@RequestBody Usuario usuario) {
        return "o parametro é " + usuario.name;
    }


    @PostMapping("/metodoHeaderParams")
    public String metodoHeaderParams(@RequestHeader("name") String name) {
        return "o parametro é " + name;
    }

    @PostMapping("/metodoListHeaderParams")
    public String metodoLisHeaderParams(@RequestHeader() Map<String, String> headers) {
        return "o parametro é " + headers.entrySet();
    }

    @GetMapping("/metodoResponseEntity/{id}")
    public ResponseEntity<Object> metodoResponsyEntity(@PathVariable Long id) {
        Usuario user = new Usuario("victor", "victor@html.com");

        if (id > 5) {
            return ResponseEntity.ok(user);
        }
        return ResponseEntity.status(400).body("Error");
    }


}
