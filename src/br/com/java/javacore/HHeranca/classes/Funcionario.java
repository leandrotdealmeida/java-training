package br.com.java.javacore.HHeranca.classes;

public class Funcionario extends Pessoa {

    private double salario;

    {
        System.out.println("BLoco de inicializacao de funcionário 1");
    }

    {
        System.out.println("Bloco de inicializacao de funcionario 2");
    }

    static
    {
        System.out.println("Bloco de inicializacao Estático do FUncionário");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor FUncionario");
    }

    public void imprime() {
        super.imprime();
        System.out.println("Salario: " + this.salario);
        imprimeReciboPagamento();
    }

    public void imprimeReciboPagamento() {
        System.out.println("Eu " + super.nome + "Recebi o pagamento de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
