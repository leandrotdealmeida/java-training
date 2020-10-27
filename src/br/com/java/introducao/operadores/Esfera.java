package br.com.java.introducao.operadores;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Meus Documentos on 18/09/2019.
 */
public class Esfera {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        float raio;
        Scanner ler = new Scanner(System.in);
        raio = ler.nextFloat();

        System.out.printf("VOLUME = %.3f\n", (4 / 3.0) * 3.14159 * (Math.pow(raio, 3)));
    }
}
