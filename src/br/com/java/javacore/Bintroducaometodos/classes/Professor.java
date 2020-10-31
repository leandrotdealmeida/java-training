package br.com.java.javacore.Bintroducaometodos.classes;

public class Professor {
    public String nome;
    public String matricula;
    public String rg;
    public String cpf;

    public void imprimeConteudo(Professor aux){
        System.out.println("Imprimindo nomes - - -- - -- - - - -  ");
        System.out.println(aux.nome);
        System.out.println(aux.matricula);
        System.out.println(aux.rg);
        System.out.println(aux.cpf);

    }
}
