package br.com.java.introducao.repeticao;

import java.util.Scanner;

public class Aula05DoWhile {
    public static void main(String[] args) {
        int desejaContinuar = 1;
        Scanner lerTeclado = new Scanner(System.in);
        do {
            System.out.println("PLAYER 1: Digite um Número de 1 a 10");
            int num1 = lerTeclado.nextInt();
            System.out.println("PLAYER 2: Digite um número de 1 a 10");
            int num2 = lerTeclado.nextInt();


        } while (desejaContinuar == 1);

    }

}
