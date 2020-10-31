package br.com.java.javacore.Dsobecargaconstrutores.classes;

import java.util.Arrays;

public class Estudante {
    private String matricula;
    private String nome;
    private double[] notas;
    private String rg;

    public Estudante(String matricula, String nome, double[] notas) {
        this.matricula = matricula;
        this.nome = nome;
        this.notas = notas;
    }

    public Estudante(String matricula, String nome, double[] notas, String rg) {
        this(matricula, nome, notas); // chama outro método construtor
        this.rg = rg;
    }

    public Estudante() {
    }

    @Override
    public String toString() {
        return "Estudante{" +
                "matricula='" + this.matricula + '\'' +
                ", nome='" + this.nome + '\'' +
                ", notas=" + Arrays.toString(this.notas) +
                '}';
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.matricula);
        for (double nota : notas) {
            System.out.println(nota + " ");
        }
        System.out.println(this.rg);

    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
}
