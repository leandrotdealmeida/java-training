package br.com.java.javacore.Aintroducaoclasses.testes;

import br.com.java.javacore.Aintroducaoclasses.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante aluno = new Estudante();
        aluno.nome = "Leandro";
        aluno.matricula = "1017";
        aluno.idade = 34;

        System.out.println(aluno.nome);
        System.out.println(aluno.matricula);
        System.out.println(aluno.idade);
    }

}
