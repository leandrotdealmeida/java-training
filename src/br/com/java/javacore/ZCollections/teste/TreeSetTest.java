package br.com.java.javacore.ZCollections.teste;

import br.com.java.javacore.ZCollections.classes.Produto;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        Produto produto1 = new Produto("123","LapTop LE Novo", 2000.0,10);
        Produto produto2 = new Produto("321","Mouse", 26.4, 10);
        Produto produto3 = new Produto("676","Telado Temer", 1000.0, 0);
        Produto produto4 = new Produto("434","Celular Glaxy", 3250.5, 0);
        Produto produto5 = new Produto("4034","Celular Glaxy 5", 2000.5, 0);
        Produto produto6 = new Produto("4034","Celular Glaxy 6", 1000.5, 0);

        NavigableSet<Produto> produtoNavigableSet = new TreeSet<>();
        produtoNavigableSet.add(produto1);
        produtoNavigableSet.add(produto2);
        produtoNavigableSet.add(produto3);
        produtoNavigableSet.add(produto4);
        produtoNavigableSet.add(produto5);
        produtoNavigableSet.add(produto6);
        for(Produto produto : produtoNavigableSet){
            System.out.println(produto);
        }

        System.out.println("---------------------");
        //lower < mais baixo
        //floor <=  chão
        //higher > superior
        //ceiling >= teto
        System.out.println(produtoNavigableSet.lower(produto3));
        System.out.println(produtoNavigableSet.floor(produto3));
        System.out.println(produtoNavigableSet.higher(produto3));
        System.out.println(produtoNavigableSet.ceiling(produto4));
        System.out.println(produtoNavigableSet.size());
        System.out.println(produtoNavigableSet.pollFirst());
        System.out.println(produtoNavigableSet.size());
        System.out.println(produtoNavigableSet.pollLast());
        System.out.println(produtoNavigableSet.size());




    }
}
