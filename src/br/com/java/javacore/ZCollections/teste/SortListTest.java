package br.com.java.javacore.ZCollections.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListTest {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Leandro");
        nomes.add("Japa");
        nomes.add("Dev Dojo");
        nomes.add("Breno");
        nomes.add("Bruno");
        nomes.add(0,"Ana");
        Collections.sort(nomes);
        List<Double> numeros = new ArrayList<>();
        numeros.add(1.5);
        numeros.add(1.3);
        numeros.add(1.9);
        numeros.add(2d);
        Collections.sort(numeros);
        for (String nome : nomes){
            System.out.println(nome);
        }

        for(Double numero : numeros) {
            System.out.println(numero);
        }

    }
}
