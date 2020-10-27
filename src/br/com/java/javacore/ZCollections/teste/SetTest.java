package br.com.java.javacore.ZCollections.teste;

import br.com.java.javacore.ZCollections.classes.Produto;

import java.util.LinkedHashSet;
import java.util.Set;


public class SetTest {
    // SET: não permite elementos repetidos
    public static void main(String[] args) {
        Produto produto1 = new Produto("123","LapTop LE Novo", 2000.0,10);
        Produto produto2 = new Produto("321","Mouse", 26.4, 10);
        Produto produto3 = new Produto("676","Telado Temer", 1000.0, 0);
        Produto produto4 = new Produto("434","Celular Glaxy", 3250.5, 0);
      //  Set<Produto> produtosSet = new HashSet<>();    // Ordem aleatória
        Set<Produto> produtosSet = new LinkedHashSet<>();  // Ordem de inserção
        produtosSet.add(produto1);
        produtosSet.add(produto2);
        produtosSet.add(produto3);
        produtosSet.add(produto4);
        for(Produto produto : produtosSet){
            System.out.println(produto);
        }
    }
}
