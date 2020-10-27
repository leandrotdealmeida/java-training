package br.com.java.javacore.ZZFpadroesdeprojeto.test;

import br.com.java.javacore.ZZFpadroesdeprojeto.classes.Moeda;
import br.com.java.javacore.ZZFpadroesdeprojeto.classes.MoedaFactory;
import br.com.java.javacore.ZZFpadroesdeprojeto.classes.Pais;

public class MoedaFactoryTest {
    public static void main(String[] args) {
        Moeda moeda = MoedaFactory.criarMoeda(Pais.USA);
        System.out.println(moeda.getSimbolo());
    }
}
