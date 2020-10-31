package br.com.java.introducao.operadores;

import java.util.Scanner;

public class LoginWhiles {
    public static void main(String[] args) {
        final String login = "Leandro", password = "123456";
        Scanner teclado = new Scanner(System.in);
        while (true) {
            System.out.println("LOGIN: ");
            String valorLogin = teclado.next();
            System.out.println("SENHA: ");
            String valorPassword = teclado.next();
            if (valorLogin.equals(login) && valorPassword.equals(password)) {
                System.out.println("ACESSO CONCEDIDO.");
                break;
            }
            System.out.println("ACESSO NEGADO.");
        }
        System.out.println("PROGRAMA FINALIZOU.");


    }
}
