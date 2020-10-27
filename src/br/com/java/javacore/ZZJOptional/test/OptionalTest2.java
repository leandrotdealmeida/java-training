package br.com.java.javacore.ZZJOptional.test;

import br.com.java.javacore.ZZJOptional.classes.Carro;
import br.com.java.javacore.ZZJOptional.classes.Pessoa;
import br.com.java.javacore.ZZJOptional.classes.Seguradora;

import java.util.Optional;

public class OptionalTest2 {

    public static void main(String[] args) {
        Seguradora seguradora = new Seguradora("Seguradora 1");
        Carro carro = new Carro(seguradora, "Audi");
        Pessoa p = new Pessoa(carro, "Japa");

        System.out.println(obterNomeSeguradora(Optional.ofNullable(p)));

    }

    private static String obterNomeSeguradora(Optional<Pessoa> pessoa) {
        return pessoa
                .flatMap(Pessoa::getCarro)
                .flatMap(Carro::getSeguradora)
                .map(Seguradora::getNome)
                .orElse("Não Existe seguradora");
    }


}
