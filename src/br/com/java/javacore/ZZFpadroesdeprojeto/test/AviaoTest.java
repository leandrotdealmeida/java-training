package br.com.java.javacore.ZZFpadroesdeprojeto.test;

import br.com.java.javacore.ZZFpadroesdeprojeto.classes.Aviao;

public class AviaoTest {

    public static void main(String[] args) {
        agendarAssento("1A");
        agendarAssento("1A");

    }

    private static void agendarAssento(String assento) {
        Aviao a = new Aviao();
        System.out.println(a.bookAssento(assento));
    }
}
