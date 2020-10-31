package br.com.java.introducao.operadores;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Meus Documentos on 16/09/2019.
 */
public class Media1 {
    public static void main(String[] args) throws IOException  {
        Locale.setDefault(Locale.US);
        double a, b, media;
        Scanner ler = new Scanner(System.in);
        a = ler.nextDouble();
        b = ler.nextDouble();
        media = ((a * 3.5) + (b * 7.5)) / 11;

        System.out.printf("MEDIA = %.5f\n", media);

    }
}
