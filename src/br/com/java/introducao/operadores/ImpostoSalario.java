package br.com.java.introducao.operadores;

import java.util.Scanner;

/**
 * Created by Meus Documentos on 11/09/2019.
 */
public class ImpostoSalario{
    public static void main(String[] args) {
        int a;
        int b;
        int soma;

        Scanner lerA = new Scanner(System.in);
        a = lerA.nextInt();
        Scanner lerB = new Scanner(System.in);
        b = lerB.nextInt();
        soma = a + b;

        System.out.println("X = " + soma);
    }
}
