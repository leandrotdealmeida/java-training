package br.com.java.javacore.ZZCJdbc.teste;

import java.util.Scanner;

public class TestCrud {
    private static Scanner teclado = new Scanner(System.in);


    public static void main(String[] args) {
        int op;
        while (true) {
            menu();
            op = Integer.parseInt(teclado.nextLine());
            if (op == 0) {
                System.out.println("Saindo do sistema");
                break;
            }
            if(op == 1) {
                menuComprador();
                op = Integer.parseInt(teclado.nextLine());
                CompradorCrud.executar(op);
            }
            if(op == 2) {
                menuCarro();
                op = Integer.parseInt(teclado.nextLine());
                CarroCrud.executar(op);
            }

        }

    }

    private static void menu() {
        System.out.println("Selecione uma opção: ");
        System.out.println("1 - Comprador ");
        System.out.println("2 - Carro ");
        System.out.println("0 - Sair ");
    }

    private static void menuComprador() {
        System.out.println("Digite ao opção para começar:");
        System.out.println("1 - Inserir Comprador");
        System.out.println("2 - Atualizar comprador");
        System.out.println("3 - Listar todos os compradores");
        System.out.println("4 - Buscar comprador por nome");
        System.out.println("5 - Deletar");
        System.out.println("9 - Voltar");
    }

    private static void menuCarro() {
        System.out.println("Digite ao opção para começar:");
        System.out.println("1 - Inserir Carro");
        System.out.println("2 - Atualizar Carro");
        System.out.println("3 - Listar todos os Carros");
        System.out.println("4 - Buscar Carro por nome");
        System.out.println("5 - Deletar");
        System.out.println("9 - Voltar");
    }
}
