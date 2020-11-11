package br.com.java.javacore.ZZKstreams.tests;

import br.com.java.javacore.ZZKstreams.classes.Genero;
import br.com.java.javacore.ZZKstreams.classes.Maioridade;
import br.com.java.javacore.ZZKstreams.classes.Pessoa;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class StreamTest6Collectors2 {
    public static void main(String[] args) {
        List<Pessoa> pessoas = Pessoa.bancoDePessoas();
        Map<Genero, List<Pessoa>> generoListMap = new HashMap<>();
        List<Pessoa> masculinos = new ArrayList<>();
        List<Pessoa> femininos = new ArrayList<>();
        for (Pessoa pessoa: pessoas) {
            if (pessoa.getGenero().equals(Genero.FEMININO))
                femininos.add(pessoa);
            else
                masculinos.add(pessoa);
        }
        generoListMap.put(Genero.FEMININO, femininos);
        generoListMap.put(Genero.MASCULINO, masculinos);

        System.out.println(generoListMap);

        // Agrupamento por genero
        Map<Genero, List<Pessoa>> collect = pessoas.stream().collect(groupingBy(Pessoa::getGenero));
        System.out.println(collect);

        // Agrupamento por maior idade
        Map<Maioridade, List<Pessoa>> collect1 = pessoas.stream().collect(groupingBy(p -> {
            if (p.getIdade() < 18) return Maioridade.MENOR;
            else return Maioridade.ADULTO;
        }));
        System.out.println(collect1);

        // Agrupando por genero e maioridade
        Map<Genero, Map<Maioridade, List<Pessoa>>> collect2 = pessoas.stream().collect(groupingBy(Pessoa::getGenero, groupingBy(p -> {
            if (p.getIdade() < 18) return Maioridade.MENOR;
            else return Maioridade.ADULTO;
        })));
        System.out.println(collect2);

        // Agrupando por genero e quantidade
        Map<Genero, Long> collect3 = pessoas.stream().collect(groupingBy(Pessoa::getGenero, counting()));
        System.out.println(collect3);

        // Agrupando por genero e maior salario
        Map<Genero, Optional<Pessoa>> collect4 = pessoas.stream().collect(groupingBy(Pessoa::getGenero, maxBy(Comparator.comparing(Pessoa::getSalario))));
        System.out.println(collect4);
        // Agrupando por genero e maior salario sem Optional
        Map<Genero, Pessoa> collect5 = pessoas.stream().collect(groupingBy(Pessoa::getGenero,
                collectingAndThen(maxBy(Comparator.comparing(Pessoa::getSalario)),
                        Optional::get)));
        System.out.println(collect5);

        // Agrupando por genero e estatisticas
        Map<Genero, DoubleSummaryStatistics> collect6 = pessoas.stream().collect(groupingBy(Pessoa::getGenero, summarizingDouble(Pessoa::getSalario)));
        System.out.println(collect6);

        // Agrupando por genero e quantidade
        Map<Genero, Set<Maioridade>> collect7 = pessoas.stream().collect(groupingBy(Pessoa::getGenero, mapping(p -> {
            if (p.getIdade() < 18) return Maioridade.MENOR;
            else return Maioridade.ADULTO;
        }, toSet())));
        System.out.println(collect7);

        Map<Genero, Set<Maioridade>> collect8 = pessoas.stream().collect(groupingBy(Pessoa::getGenero, mapping(p -> {
            if (p.getIdade() < 18) return Maioridade.MENOR;
            else return Maioridade.ADULTO;
        }, toCollection(LinkedHashSet::new))));
        System.out.println(collect8);


    }
}
