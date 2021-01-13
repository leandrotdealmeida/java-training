package br.com.java.javacore.ZZMCompletableFuture.test;

import br.com.java.javacore.ZZMCompletableFuture.classes.Loja;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class LojaTest {

    public static void main(String[] args) {
        Loja americanas = new Loja();
        Loja bahia = new Loja();
        Loja walmart = new Loja();
        Loja extra = new Loja();
//        long start = System.currentTimeMillis();
//        System.out.println(americanas.getPreco());
//        System.out.println(bahia.getPreco());
//        System.out.println(walmart.getPreco());
//        System.out.println(extra.getPreco());
//        System.out.println(System.currentTimeMillis() - start + " ms");
        long start = System.currentTimeMillis();
        Future<Double> precoAsync = americanas.getPrecoAsync();
        Future<Double> precoAsync2 = bahia.getPrecoAsync();
        Future<Double> precoAsync3= walmart.getPrecoAsync();
        Future<Double> precoAsync4 = extra.getPrecoAsync();
        long end = System.currentTimeMillis();
        System.out.println("Tempo de inovacao: "+ (end - start) + " ms");
        enrolando();
        try {
            System.out.println("Americanas " + precoAsync.get());
            System.out.println("Bahia " + precoAsync2.get());
            System.out.println("Walmart " + precoAsync3.get());
            System.out.println("Extra " + precoAsync4.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("Tempo que levou apra égar o resultado: " + (System.currentTimeMillis() - start) + "ms");
    }

    public static void enrolando() {
        long soma = 0;
        for (int i = 0; i < 1_000_000 ; i++) {
            soma += i;
        }
        System.out.println(soma);
    }
}
