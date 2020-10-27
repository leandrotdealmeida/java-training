package br.com.java.javacore.Lclassesabstratas.classes;

public class Vendedor extends Funcionario {

    private double totalVendas;

    @Override
    public void calculaSalario() {

        this.salario = salario + (totalVendas * 0.2);
    }

    public Vendedor() {
    }

    public Vendedor(String nome, String clt, double salario, double totalVendas) {
        super(nome, clt, salario);
        this.totalVendas = totalVendas;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }


}
