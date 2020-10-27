package br.com.java.introducao.operadores;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class OMaior {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        int a,b,c;
        int maior;
        Scanner ler = new Scanner(System.in);
        a = ler.nextInt();
        b = ler.nextInt();
        c = ler.nextInt();
        maior = (a + b +  Math.abs( a - b ))  / 2;
        if(c > maior )
            maior = c;
        System.out.println(maior + " eh o maior");

    }
}
