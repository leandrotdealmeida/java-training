package br.com.java.padroesdeprojeto.dPrototype.model;

import br.com.java.padroesdeprojeto.dPrototype.interfaces.IConta;

public class ContaFisicaImpl implements IConta {

    private String tipo;
    private double saldo;

    public ContaFisicaImpl() {
        tipo = "Salvar";
    }

    @Override
    public IConta clonar() {

        ContaFisicaImpl conta = null;

        try {
            conta = (ContaFisicaImpl) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return conta;
    }

    @Override
    public String toString() {
        return "ContaFisicaImpl{" +
                "tipo='" + tipo + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
