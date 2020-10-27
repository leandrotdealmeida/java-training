package br.com.java.java8.streams;

import java.util.*;
import java.util.stream.Collectors;

public class StreamJava8Test {
    public static void main(String[] args) {
        //Versão 4 do java
        List<Integer> lista = Arrays.asList(1, 5, 8, 7, 4, 6, 3, 2, 1, 8, 5, 7, 4);
        for (Iterator<Integer> numero = lista.iterator(); numero.hasNext();) {
            Integer integer = numero.next();
            System.out.print(integer);

        }
        System.out.println("---------------");
        //versão 6 do java
        List<Integer> lista2 = Arrays.asList(1, 5, 8, 7, 4, 6, 3, 2, 1, 8, 5, 7, 4);
        for(Integer numero : lista2){
            System.out.print(numero);

        }
        System.out.println("---------------");

        //versão 8 do java (FOREACH)
        List<Integer> listaStream = Arrays.asList(1, 5, 8, 7, 4, 6, 3, 2, 1, 8, 5, 7, 4);
        listaStream.stream().forEach(System.out::print);

        System.out.println("---------------");
        //Operações intermediárias em Streams do Java 8 - Skip , limit distinct
        List<Integer> listaLimite = Arrays.asList(1, 5, 8, 7, 4, 6, 3, 2, 1, 8, 5, 7, 4);
        listaLimite.stream()
                .skip(2)
                .limit(3)
                .distinct()
                .forEach(System.out::print);

        System.out.println("---------------");
        List<Integer> listaFiltro = Arrays.asList(1, 5, 8, 7, 4, 6, 3, 2, 1, 8, 5, 7, 4);
        listaFiltro.stream()
                .filter(e -> e % 2 == 0) //mantem apenas numeros pares
                .forEach(System.out::print);

        System.out.println("---------------");
        List<Integer> listaMapTransformar = Arrays.asList(1, 5, 8, 7, 4, 6, 3, 2, 1, 8, 5, 7, 4);
        listaMapTransformar.stream()
                .map(e -> e * 2) // multiplica cada item por 2
                .forEach(e -> System.out.print(e + " ")); //imprime todos no console


        //Operações finais em Streams do Java 8
        System.out.println("---------------");
        List<Integer> listaMapMax = Arrays.asList(1, 5, 8, 7, 4, 6, 3, 2, 1, 8, 5, 7, 4);
        Optional<Integer> maiorNumero = listaMapMax.stream()
                .map(e -> e * 2) //multiplica cada um por dois
                .max(Comparator.naturalOrder());// pega o maior item pela ordem natural
        System.out.println(maiorNumero.get());

        System.out.println("---------------");
        List<Integer> listaMapMin = Arrays.asList(1, 5, 8, 7, 4, 6, 3, 2, 1, 8, 5, 7, 4);
        Optional<Integer> menorNumero = listaMapMax.stream()
                .map(e -> e * 2)
                .min(Comparator.naturalOrder());
        System.out.println(menorNumero.get());

        System.out.println("---------------");
        List<Integer> listaCount = Arrays.asList(1, 5, 8, 7, 4, 6, 3, 2, 1, 8, 5, 7, 4);
        Long quantidade = listaCount.stream()
                .filter(e -> e % 2 == 0) // mantem os numeros pares
                .count(); // pega qts itens restam no stream
        System.out.println(quantidade);

        System.out.println("---------------");
        List<Integer> listaCollect = Arrays.asList(1, 5, 8, 7, 4, 6, 3, 2, 1, 8, 5, 7, 4);
        List<Integer> novaLista = listaMapMax.stream()
                .filter(e -> e % 2 == 0)
                .map(e -> e * 2)
                .collect(Collectors.toList()); // coleta todos os itensem uma nova lista
        System.out.println(novaLista);

        System.out.println("---------------");
        List<Integer> listaCollectGroup = Arrays.asList(1, 5, 8, 7, 4, 6, 3, 2, 1, 8, 5, 7, 4);
        Map<Boolean, List<Integer>> mapa = listaCollectGroup.stream()
                .map(e -> e * 2) // multiplica cada item por 2
                .collect(Collectors.groupingBy(e -> e > 8)); //agrupa itens baseado no resultado da comparacao
        System.out.println(mapa);

        System.out.println("---------------");
        List<Integer> listaUnica = Arrays.asList(1, 5, 8, 7, 4, 2, 3, 2, 1, 8, 5, 7, 4);
        String stringUnica = lista.stream()
                .map(String::valueOf) // transforma cada item em String
                .collect(Collectors.joining(";")); // junta todas as Strings em uma única separada por ';'
        System.out.println(stringUnica);
    }
}
