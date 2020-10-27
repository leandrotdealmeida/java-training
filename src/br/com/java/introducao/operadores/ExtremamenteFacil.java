package br.com.java.introducao.operadores;

import java.util.Locale;
import java.util.Scanner;
import java.io.IOException;


public class ExtremamenteFacil{
    public static void main(String[] args) throws IOException  {
        Locale.setDefault(Locale.US);
        int a,b,soma;
        Scanner ler = new Scanner(System.in);
        a = ler.nextInt();
        b = ler.nextInt();
        soma = a + b;
        ler.close();


        System.out.printf("X = %d\n" , soma);
    }
}
