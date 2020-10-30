package br.com.java.javacore.ZZKstreams.classes;

import java.util.List;
import java.util.Objects;

import static java.util.Arrays.asList;

public class Pessoa {

    private String nome;
    private int idade;
    private double salario;

    public Pessoa(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public static List<Pessoa> bancoDePessoas() {
        return asList(
                new Pessoa("Dev Japa", 22, 8000),
                new Pessoa("Dev Leandro", 22, 3000),
                new Pessoa("Dev Leandro", 22, 3000),
                new Pessoa("Dev Almeida", 24, 4000),
                new Pessoa("Dev Trovilho", 21, 9060),
                new Pessoa("Dev Hulk", 35, 7200),
                new Pessoa("Dev Spider", 44, 3300),
                new Pessoa("Dev Joha", 54, 7800),
                new Pessoa("Dev Batman", 20, 5500)
        );
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", salario=" + salario +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(nome, pessoa.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
