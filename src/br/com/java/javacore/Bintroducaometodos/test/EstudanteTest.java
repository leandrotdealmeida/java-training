package br.com.java.javacore.Bintroducaometodos.test;

import br.com.java.javacore.Bintroducaometodos.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.setNome("Munior");
        estudante.setIdade(20);
        estudante.setNotas(new double[]{6, 5, 8});
        estudante.print();
        estudante.calculaMedia();
        System.out.println(estudante.isAprovado());
    }
}
