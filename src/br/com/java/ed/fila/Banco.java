package br.com.java.ed.fila;

public class Banco {
    public static void main(String[] args) {
        Fila f = new Fila();
        int e;

        f.inserir(132);
        f.inserir(343);
        f.inserir(133);
        f.inserir(144);
        f.inserir(444);

        System.out.println("Bem vindos ao Banco IsiBank!");
        System.out.println("Servimos bem para servir sempre!");
        System.out.println("Atendimento-----------");
        while (!f.isEmpty()) {
            e = f.retirar();
            System.out.println("Senha a ser atendida no guiche: " + e);

        }
    }
}
