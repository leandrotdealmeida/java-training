package br.com.java.javacore.ZCollections.teste;

import br.com.java.javacore.ZCollections.classes.Produto;

import java.util.*;

class ProdutoNomeComparator implements Comparator<Produto>{

    @Override
    public int compare(Produto o1, Produto o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}

public class SortProdutoTest {
    public static void main(String[] args) {
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

        produtosArrays[0] = produto1;
        produtosArrays[1] = produto2;
        produtosArrays[2] = produto3;
        produtosArrays[3] = produto4;

        Collections.sort(produtos, new ProdutoNomeComparator());
//        for(Produto produto : produtos){
//            System.out.println(produto);
//        }
       System.out.println(Arrays.toString(produtosArrays));
        Arrays.sort(produtosArrays, new ProdutoNomeComparator());
        for(Produto produto : produtosArrays){
            System.out.println(produto);
        }
    }
}
