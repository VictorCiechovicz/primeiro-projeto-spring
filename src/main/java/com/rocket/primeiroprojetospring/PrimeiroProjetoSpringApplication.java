package com.rocket.primeiroprojetospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//esse anotation é para que a classe principal lendo tudo o que esta dentro da pasta com.rocket
@ComponentScan(basePackages = "com.rocket")
public class PrimeiroProjetoSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrimeiroProjetoSpringApplication.class, args);
    }

}
