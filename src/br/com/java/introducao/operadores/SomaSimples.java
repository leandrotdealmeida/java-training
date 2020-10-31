package br.com.java.introducao.operadores;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class SomaSimples {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        int a, b, soma;
        Scanner ler = new Scanner(System.in);
        a = ler.nextInt();
        b = ler.nextInt();
        soma = a + b;
        ler.close();

        System.out.printf("SOMA = %d\n", soma);


    }
}
