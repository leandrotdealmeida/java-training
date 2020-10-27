package br.com.java.introducao.operadores;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Cedulas {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        int valor = 0, n100 = 0, n50 = 0, n20 = 0, n10 = 0, n5 = 0, n2 = 0, n1 = 0;
        int r100 = 0, r50 = 0, r20 = 0, r10 = 0, r5 = 0, r2 = 0, r1 = 0;
        Scanner ler = new Scanner(System.in);
        valor = ler.nextInt();

        if (valor > 0 && valor < 1000000) {
            n100 = valor / 100;
            r100 = valor % 100;

            n50 = r100 / 50;
            r50 = r100 % 50;

            n20 = r50 / 20;
            r20 = r50 % 20;

            n10 = r20 / 10;
            r10 = r20 % 10;

            n5 = r10 / 5;
            r5 = r10 % 5;

            n2 = r5 / 2;
            r2 = r5 % 2;

            n1 = r2;
        }
        ler.close();
        System.out.print(valor + "\n");
        System.out.print(n100 + " nota(s) de R$ 100,00\n");
        System.out.print(n50 + " nota(s) de R$ 50,00\n");
        System.out.print(n20 + " nota(s) de R$ 20,00\n");
        System.out.print(n10 + " nota(s) de R$ 10,00\n");
        System.out.print(n5 + " nota(s) de R$ 5,00\n");
        System.out.print(n2 + " nota(s) de R$ 2,00\n");
        System.out.print(n1 + " nota(s) de R$ 1,00\n");


    }
}
