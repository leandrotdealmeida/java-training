package br.com.java.javacore.ZZJOptional.classes;

import java.util.Optional;

public class Pessoa {
    private Carro carro;
    private String name;

    public Pessoa(Carro carro, String name) {
        this.carro = carro;
        this.name = name;
    }

    public Optional<Carro> getCarro()
    {
        return Optional.ofNullable(carro);
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
