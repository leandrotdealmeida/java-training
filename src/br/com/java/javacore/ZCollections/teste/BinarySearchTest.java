package br.com.java.javacore.ZCollections.teste;

import br.com.java.javacore.ZCollections.classes.Produto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(0);
        numeros.add(3);
        numeros.add(4);
        //(-(ponto de inserção) -1), -1 -1 = -2
        Collections.sort(numeros);
        //[0],[1],[2],[3]
        //0,2,3,4
        System.out.println(Collections.binarySearch(numeros,1));
        //System.out.println(numeros.get(Collections.binarySearch(numeros,1)));

        List<Produto> produtos = new ArrayList<>();
        Produto[] produtosArrays = new Produto[4];
        Produto produto1 = new Produto("123","LapTop LE Novo", 2000.0);
        Produto produto2 = new Produto("321","Mouse", 26.4);
        Produto produto3 = new Produto("676","Telado Temer", 1000.0);
        Produto produto4 = new Produto("434","Celular Glaxy", 3250.5);
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        Collections.sort(produtos, new ProdutoNomeComparator());
        Produto produto5 = new Produto("000", "Antena", 50);
         for(Produto produto : produtos){
            System.out.println(produto);
        }
        System.out.println(Collections.binarySearch(produtos, produto5, new ProdutoNomeComparator()));
         Integer[] arraysInteger = new Integer[4];
         arraysInteger[0] = 2;
         arraysInteger[1] = 0;
         arraysInteger[2] = 4;
         arraysInteger[3] = 3;
        Arrays.sort(arraysInteger);
        System.out.println(Arrays.binarySearch(arraysInteger, 1));
    }

}
