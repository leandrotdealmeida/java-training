package br.com.java.javacore.Isobrescrita.tests;


import br.com.java.javacore.Isobrescrita.classes.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Japa");
        p.setIdade(34);
        System.out.println(p);
    }
}
