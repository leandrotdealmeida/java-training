package br.com.java.javacore.ZZFpadroesdeprojeto.test;

import br.com.java.javacore.ZZFpadroesdeprojeto.classes.AviaoSingletonEnum;

public class AviaoSingletonEnumTest {

    public static void main(String[] args) {
        AviaoSingletonEnum.agendarAssento("1A");
        AviaoSingletonEnum.agendarAssento("1A");
    }
}
