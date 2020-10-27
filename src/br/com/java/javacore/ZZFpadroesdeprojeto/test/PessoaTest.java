package br.com.java.javacore.ZZFpadroesdeprojeto.test;

import br.com.java.javacore.ZZFpadroesdeprojeto.classes.Pessoa;

public class PessoaTest {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa.PessoaBuilder("Leandro")
                .nomeDoMeio("Trovilho")
                .ultimoNome("Almeida")
                .apelido("Japa")
                .nomeDopai("Silvio")
                .build();

        System.out.println(pessoa);
    }
}
