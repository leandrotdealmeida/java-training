package br.com.java.javacore.ZZDthreads.classes;

public class Conta {

    private int saldo = 50;

    public int getSaldo() {
        return saldo;
    }

    public void saque(int valor) {
        this.saldo = saldo - valor;
    }
}
