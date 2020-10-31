package br.com.java.introducao.operadores;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class SalarioFuncionario {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        int numeroFuncionario, numeroHoras;
        double valorHoras;
        Scanner ler = new Scanner(System.in);
        numeroFuncionario = ler.nextInt();
        numeroHoras = ler.nextInt();
        valorHoras = ler.nextDouble();

        System.out.printf("NUMBER = %d\n", numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f\n", numeroHoras * valorHoras);


    }
}
