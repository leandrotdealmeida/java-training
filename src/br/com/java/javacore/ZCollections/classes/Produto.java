package br.com.java.javacore.ZCollections.classes;

import java.util.Objects;

public class Produto implements Comparable<Produto> {
    private String serialNumber;
    private String nome;
    private Double preço;
    private int quantidade;

    public Produto(String serialNumber, String nome, double preço) {
        this.serialNumber = serialNumber;
        this.nome = nome;
        this.preço = preço;
    }

    public Produto(String serialNumber, String nome, Double preço, int quantidade) {
        this.serialNumber = serialNumber;
        this.nome = nome;
        this.preço = preço;
        this.quantidade = quantidade;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreço() {
        return preço;
    }

    public void setPreço(Double preço) {
        this.preço = preço;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(serialNumber, produto.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNumber);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "serialNumber='" + serialNumber + '\'' +
                ", nome='" + nome + '\'' +
                ", preço=" + preço +
                ", quantidade=" + quantidade +
                '}';
    }

    @Override
    public int compareTo(Produto outroObjeto) {
        //negativo se thisObject < outroObjeto
        //0 se thisObject = outroObjeto
        //positivo se thisObject > outroObjeto
       // return this.serialNumber.compareTo(outroObjeto.getSerialNumber());
        return this.preço.compareTo(outroObjeto.getPreço());
    }
}
