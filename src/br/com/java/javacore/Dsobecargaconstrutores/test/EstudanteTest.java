package br.com.java.javacore.Dsobecargaconstrutores.test;

import br.com.java.javacore.Dsobecargaconstrutores.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante("23113", "Leandro JAhpa", new double[]{3,5,7}, "313111");
        estudante.imprime();
        System.out.println("------------");

    }
}
