package br.com.java.javacore.ZZKstreams.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class StreamTest2 {

    public static void main(String[] args) {
        List<List<String>> nomes = new ArrayList<>();
        nomes.add(asList("Devjapa", "Valeu por aumentar a letra"));
        nomes.add(asList("Japa", "pq vc demorou 180 aulas pra isso?"));
        List<String> collect = nomes.stream().flatMap(Collection::stream).collect(Collectors.toList());
        collect.forEach(System.out::println);
        System.out.println(collect);

        List<String> palavras = asList("Ola", "Goku");
        final String[] split = palavras.get(0).split("");
        System.out.println(Arrays.toString(split));
        List<String[]> collect1 = palavras.stream().map(p -> p.split("")).collect(Collectors.toList());
        Stream<String> stream = Arrays.stream((String[]) palavras.toArray());
        List<String> collect2 = palavras.stream() // Stream<String>
                .map(p -> p.split(""))  // Stream<String[]>
                .flatMap(Arrays::stream)  //Stream<String>
                .collect(Collectors.toList());

        System.out.println(collect2);
    }
}
