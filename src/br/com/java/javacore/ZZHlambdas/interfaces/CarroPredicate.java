package br.com.java.javacore.ZZHlambdas.interfaces;

import br.com.java.javacore.ZZHlambdas.classes.Carro;

@FunctionalInterface
public interface CarroPredicate {

    boolean test(Carro carro);
    // (parametro) -> <expressao>
    // (Carro carro) -> carro.getCor().equals("verde");
}
