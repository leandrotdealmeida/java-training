package br.com.java.javacore.ZCollections.teste;

import br.com.java.javacore.ZCollections.classes.Consumidor;
import br.com.java.javacore.ZCollections.classes.Produto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConsumidorMapTest {
    public static void main(String[] args) {
        Consumidor consumidor = new Consumidor("Leandro", "04322");
        Consumidor consumidor2 = new Consumidor("Jahpa Company", "34223");

        Produto produto1 = new Produto("123","LapTop LE Novo", 2000.0,10);
        Produto produto2 = new Produto("321","Mouse", 26.4, 10);
        Produto produto3 = new Produto("676","Telado Temer", 1000.0, 0);
        Produto produto4 = new Produto("434","Celular Glaxy", 3250.5, 0);

       // Map<Consumidor, Produto> map = new HashMap<>();
        Map<Consumidor, List<Produto>> map = new HashMap<>();

        List<Produto> produtos = new ArrayList<>();
        produtos.add(produto1);
        produtos.add(produto2);
        List<Produto> produtos2 = new ArrayList<>();
        produtos2.add(produto3);
        produtos2.add(produto4);

//        map.put(consumidor, produto2);
//        map.put(consumidor2, produto4);
//        for(Map.Entry<Consumidor, Produto> entry : map.entrySet()){
//            System.out.println(entry.getKey().getNome() + "-" + entry.getValue().getNome());
//        }

        map.put(consumidor, produtos);
        map.put(consumidor2, produtos2);
        for(Map.Entry<Consumidor, List<Produto>> entry : map.entrySet()){
            System.out.println(entry.getKey().getNome());
            for(Produto produto : entry.getValue()){
                System.out.println(produto.getNome());
            }
        }

    }
}
