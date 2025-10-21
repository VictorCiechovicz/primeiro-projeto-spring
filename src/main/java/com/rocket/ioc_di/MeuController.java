package com.rocket.ioc_di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/component")
public class MeuController {

    /// essa anotation faz com que o spring se responsabilize para estanciar essa classe
    /// porem na classa temos que colocar uma anotacao de @Component ou outro
    @Autowired
    MeuComponente meuComponente;


    @GetMapping("/")
    public String chamandoComponente() {
        var result = meuComponente.chamarMeuComponente();
        return result;


    }


}
