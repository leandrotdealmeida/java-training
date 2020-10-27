package br.com.java.javacore.ZZDthreads.test;

import br.com.java.javacore.ZZDthreads.classes.Conta;

public class ContaTest implements Runnable {
    private Conta conta = new Conta();

    public static void main(String[] args) {
        ContaTest contaTest = new ContaTest();
        Thread leandro = new Thread(contaTest, "Leandro");
        Thread ana = new Thread(contaTest, "Ana");
        leandro.start();
        ana.start();

    }

    public static void imprime() {
        synchronized (ContaTest.class) {
            System.out.println("faafasfa");
        }
    }

    public  void saque(int valor) {
        synchronized(conta) {
            if (conta.getSaldo() >= valor) {
                System.out.println(Thread.currentThread().getName() + " está indo sacar ");
                conta.saque(valor);
                System.out.println(Thread.currentThread().getName() + " completou o saque, saldo: " + conta.getSaldo());
            } else {
                System.out.println("Sem dinheiro para " + Thread.currentThread().getName() + " efetuar o saque, saldo: " + conta.getSaldo());
            }
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            saque(10);
            if(conta.getSaldo() < 0){
                System.out.println("Oh meu Deus...");
            }
        }

    }
}
