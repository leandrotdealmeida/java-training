package br.com.java.introducao.operadores;

import java.util.Scanner;

public class CalcularImpostoWhile {
    public static void main(String[] args) {
        int numero = 0;
        Scanner ler = new Scanner(System.in);
        while (numero != 3) {
            System.out.println("1. Calcular imposto");
            System.out.println("2. Depositar Salário");
            System.out.println("3. Sair");
            System.out.println("Digite a sua opção: ");
            numero = ler.nextInt();
            if (numero == 1) {
                System.out.println("Calcular Imposto..");

            } else if (numero == 2) {
                System.out.println("Depositar Salario");
            }

        }
        System.out.println("FIm ");
    }


}
