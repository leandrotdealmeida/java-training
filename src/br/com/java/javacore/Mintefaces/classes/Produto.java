package br.com.java.javacore.Mintefaces.classes;

public class Produto implements Tributavel, Transportavel {

    private String name;
    private double peso;
    private double preco;
    private double precoFinal;
    private double valorFrete;


    @Override
    public void calculaFrete() {
        this.valorFrete = this.preco / this.peso * 0.1;
    }

    @Override
    public void calculaImposto() {
        this.precoFinal = this.preco + (this.preco * IMPOSTO);
    }

    public Produto(String name, double peso, double preco) {
        this.name = name;
        this.peso = peso;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "name='" + name + '\'' +
                ", peso=" + peso +
                ", preco=" + preco +
                ", precoFinal com Imposto=" + precoFinal +
                ", valorFrete=" + valorFrete +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPrecoFinal() {
        return precoFinal;
    }

    public double getValorFrete() {
        return valorFrete;
    }
}
