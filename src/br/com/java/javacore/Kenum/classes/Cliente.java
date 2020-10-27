package br.com.java.javacore.Kenum.classes;

public class Cliente {
    public enum TipoPagamento {
        AVISTA, APRAZO;
    }
    private String nome;
    private TipoCiente tipoCliente;
    private   TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCiente tipo, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipo;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipo cliente=" + tipoCliente.getNome() +
                ", tipoPagamento=" + tipoPagamento +
                ", numero= "+ tipoCliente.getTipo() +
                '}';
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCiente getTipo() {
        return tipoCliente;
    }

    public void setTipo(TipoCiente tipo) {
        this.tipoCliente = tipo;
    }
}
