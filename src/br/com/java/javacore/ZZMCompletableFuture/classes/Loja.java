package br.com.java.javacore.ZZMCompletableFuture.classes;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class Loja {
    public double getPreco() {
        // vai pegar o preço onde jduas perdeus as botas
        return calcularPreco();
    }

    public Future<Double> getPrecoAsync() {
        CompletableFuture<Double> precoFututo = new CompletableFuture<>();
        new Thread(() -> {
            precoFututo.complete(calcularPreco());
        }).start();
        return precoFututo;
    }

    private double calcularPreco() {
        delay();
        return ThreadLocalRandom.current().nextDouble() * 100;
    }

    private static void delay() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
