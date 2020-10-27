package br.com.java.judgeonline;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Quadrante {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner lerTeclado = new Scanner(System.in);
        float x = lerTeclado.nextFloat();
        float y = lerTeclado.nextFloat();
        if (x == 0 && y !=0) {
            System.out.println("Eixo Y");
        } else if (y == 0 && x != 0) {
            System.out.println("Eixo X");
        } else if (x == 0 && y == 0) {
            System.out.println("Origem");
        } else if (x > 0 && y > 0) {
            System.out.println("Q1");
        } else if (x < 0 && y > 0) {
            System.out.println("Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");
        } else {
            System.out.println("Q4");
        }
    }
}
