package br.com.java.javacore.ZZAGenerics.test;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Jahpa");
        lista.add("Trovil");
        lista.add("ALmeida");
        for(String list : lista) {
            System.out.println(list);
        }

        addList(lista, 1L);

//        for(String obj : lista){
//            System.out.println(obj);
//        }
    }

    public static void addList(List list, Long id){

        list.add(id);
    }
}
