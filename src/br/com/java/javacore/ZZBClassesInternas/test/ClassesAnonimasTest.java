package br.com.java.javacore.ZZBClassesInternas.test;

import br.com.java.javacore.ZZAGenerics.classes.Carro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Animal {
    public void andar() {
        System.out.println("Animal andando");
    }
}
public class ClassesAnonimasTest {
    public static void main(String[] args) {
        Animal animal = new Animal() {
            public void andar() {
                System.out.println("Andando anonimamente");
            }
            public void comer() {
                System.out.println("Comendo");
            }
        };
        animal.andar();
       // animal.comer(); // X

        List<Carro> carroList = new ArrayList<>();
        carroList.add(new Carro("BMW"));
        carroList.add(new Carro("AUDI"));
        Collections.sort(carroList, new Comparator<Carro>() {
            @Override
            public int compare(Carro o1, Carro o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });
        System.out.println(carroList);
    }
}

