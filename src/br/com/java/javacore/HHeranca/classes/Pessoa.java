package br.com.java.javacore.HHeranca.classes;

public class Pessoa extends Object {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    public Pessoa(){}



    public Pessoa(String nome) {
        System.out.println("Dentro do construtor Pessoa");
        this.nome = nome;
    }

    static {
        System.out.println("Bloco de inicializacao estatico de Pessoa");
    }

    {
        System.out.println("Bloco de inicializacao  de PEssoa 1");
    }

    {
        System.out.println("Bloco de inicilizacao de Pessoa 2");
    }


    public Pessoa(String nome, String cpf) {
        this(nome);
        this.cpf = cpf;
    }

    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Endereco: " + this.endereco.getRua());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
