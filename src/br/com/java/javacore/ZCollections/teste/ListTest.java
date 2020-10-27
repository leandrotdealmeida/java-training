package br.com.java.javacore.ZCollections.teste;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        List<String> nomes2 = new ArrayList<>();
        nomes.add("Leandro");
        nomes.add("Japa");
        nomes2.add("Leandro2");
        nomes2.add("Japa2");
//        System.out.println("Size:" + nomes.size());
//        System.out.println(nomes.remove("Japa"));
//        System.out.println("Size:" + nomes.size());
        nomes.clear();
        nomes.addAll(nomes2);
        int size = nomes.size();
        for(int i = 0; i < size; i++){
            System.out.println(nomes.get(i));
            nomes.add("Trovilho");
        }

        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }
        for(Integer numero : numeros){
            System.out.println(numero);
        }


    }
}
