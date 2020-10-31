package br.com.java.javacore.Jmodificadorfinal.tests;

import br.com.java.javacore.Jmodificadorfinal.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro c = new Carro();
        c.getComprador().setNome("Kurinin");
        System.out.println(c.getComprador());

    }
}
