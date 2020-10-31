package br.com.java.introducao.operadores;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Meus Documentos on 18/09/2019.
 */
public class Area {
    public static void main(String[] args) throws IOException{
        Locale.setDefault(Locale.US);
        float a,b,c;
        Scanner ler = new Scanner(System.in);
        a = ler.nextFloat();
        b = ler.nextFloat();
        c = ler.nextFloat();
        ler.close();
        System.out.printf("TRIANGULO: %.3f\n", (a * c) / 2);
        System.out.printf("CIRCULO: %.3f\n",3.14159 * (Math.pow(c,2)));
        System.out.printf("TRAPEZIO: %.3f\n", (a + b) * c / 2);
        System.out.printf("QUADRADO: %.3f\n", b * b);
        System.out.printf("RETANGULO: %.3f\n", a * b);

    }
}
