package com.rocket.ioc_di;


import org.springframework.stereotype.Component;

@Component
public class MeuComponente {

    public String chamarMeuComponente() {
        return "Chamado o meu componente";
    }
}
