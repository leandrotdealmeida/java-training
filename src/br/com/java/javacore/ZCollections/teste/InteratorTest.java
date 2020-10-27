package br.com.java.javacore.ZCollections.teste;

import br.com.java.javacore.ZCollections.classes.Produto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InteratorTest {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        Produto[] produtosArrays = new Produto[4];
        Produto produto1 = new Produto("123","LapTop LE Novo", 2000.0,10);
        Produto produto2 = new Produto("321","Mouse", 26.4, 10);
        Produto produto3 = new Produto("676","Telado Temer", 1000.0, 0);
        Produto produto4 = new Produto("434","Celular Glaxy", 3250.5, 0);
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
//        System.out.println(produtos.size());
//        for(Produto produto : produtos){
//            if(produto.getQuantidade() == 0){
//                System.out.println(produto);
//                produtos.remove(produto);
//            }
//        }
//        System.out.println(produtos.size());

        Iterator<Produto> produtoIterator =  produtos.iterator();
        while(produtoIterator.hasNext()){
            //Produto produto = produtoIterator.next();
            if(produtoIterator.next().getQuantidade() == 0){
                produtoIterator.remove();
            }
        }
        System.out.println(produtos.size());
        System.out.println(produtos);

    }
}
