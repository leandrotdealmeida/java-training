package br.com.java.introducao.operadores;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Media2 {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        double a, b, c, media;
        Scanner ler = new Scanner(System.in);
        a = ler.nextDouble();
        b = ler.nextDouble();
        c = ler.nextDouble();
        media = ((a * 2) + (b * 3) + (c * 5)) / 10;

        System.out.printf("MEDIA = %.1f\n", media);


    }


}