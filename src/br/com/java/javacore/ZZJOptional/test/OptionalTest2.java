package br.com.java.javacore.ZZJOptional.test;

import br.com.java.javacore.ZZJOptional.classes.Carro;
import br.com.java.javacore.ZZJOptional.classes.Pessoa;
import br.com.java.javacore.ZZJOptional.classes.Seguradora;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalTest2 {

    public static void main(String[] args) {
        Seguradora seguradora = new Seguradora("Seguradora 1");
        Carro carro = new Carro(seguradora, "Audi");
        Pessoa p = new Pessoa(carro, "Japa");
        //System.out.println(obterNomeSeguradora(Optional.ofNullable(p)));
        chegarNomeSeguradora(seguradora);
        chegarNomeSeguradoraOptional(seguradora);
        p.setIdade(13);
        System.out.println(obterNomeSeguradoraComIdade(p, 19));

        Map<String, String> map = new HashMap<>();
        System.out.println(Optional.ofNullable(map.get("JAh")));

        stringToInt("1");

    }

    private static Optional<Integer> stringToInt(String numero){
        try{
            return Optional.of(Integer.parseInt(numero));
        }catch (NumberFormatException e) {
            return Optional.empty();
        }
    }

    private static void chegarNomeSeguradora(Seguradora seguradora) {
        if (seguradora != null && seguradora.getNome().equals("Seguradora 1")) {
            System.out.println("É seguradora 1");
        }

    }

    private static void chegarNomeSeguradoraOptional(Seguradora seguradora) {
        Optional.ofNullable(seguradora).filter(s -> s.getNome().equals("Seguradora 1"))
                .ifPresent(s -> System.out.println("É seguradora 1"));
    }

    private static String obterNomeSeguradoraComIdade(Pessoa p, int idadeMinima) {
      return  Optional.ofNullable(p)
                .filter(pessoa -> pessoa.getIdade() >= idadeMinima)
                .flatMap(Pessoa::getCarro)
                .flatMap(Carro::getSeguradora)
                .map(Seguradora::getNome)
                .orElse("Não existe seguradora ou a idade não atingiu o limite mínimo");

    }

    private static String obterNomeSeguradora(Optional<Pessoa> pessoa) {
        return pessoa
                .flatMap(Pessoa::getCarro)
                .flatMap(Carro::getSeguradora)
                .map(Seguradora::getNome)
                .orElse("Não Existe seguradora");
    }


}
