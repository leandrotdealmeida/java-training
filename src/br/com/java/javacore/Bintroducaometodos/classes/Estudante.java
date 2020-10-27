package br.com.java.javacore.Bintroducaometodos.classes;

public class Estudante {
    private String nome;
    private int idade;
    private double[] notas;
    private boolean aprovado;

    public void print() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (notas != null) {
            for (double nota : notas) {
                System.out.print(nota + " ");
            }
        }
    }

    public void calculaMedia() {
        if (notas == null) {
            System.out.println("Esse aluno nao possui notas.");
            return;
        }
        double media = 0.0;
        for (double nota : notas) {
            media += nota;
        }
        media = media / notas.length;
        if (media > 6) {
            aprovado = true;
            System.out.println("A media foi de: " + media + " e o aluno foi aprovado.");
        } else {
            aprovado = false;
            System.out.println("A media foi de: " + media + " e o aluno foi reprovado.");
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("Você não pode fazer isso..");
        }
        this.idade = idade;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public double[] getNotas() {
        return this.notas;
    }

    public boolean isAprovado() {
        return this.aprovado;
    }

}
