package br.com.java.javacore.ZZJOptional.test;

import java.util.Optional;

public class OptionalTest1 {
    private String nome;
    public static void main(String[] args) {
        OptionalTest1 ot = new OptionalTest1();
        Optional<String> optional1 = Optional.of("DevJapa");
        Optional<String> optional2 = Optional.empty();
        Optional<String> optional3 = Optional.ofNullable(ot.nome);
        // imprimindo
        System.out.println(optional1);
        System.out.println(optional2);
        System.out.println(optional3);
        // buscando valores
        System.out.println(optional1.orElse("vazio"));
        System.out.println(optional2.orElse("vazio"));
        System.out.println(optional3.orElse("vazio"));
        //System.out.println(ot.nome.toUpperCase());

    }
}
