package br.com.java.judgeonline;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class FormulaDeBaskara {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        double a, b, c;
        double delta, r1, r2;
        Scanner lerTeclado = new Scanner(System.in);
        a = lerTeclado.nextDouble();
        b = lerTeclado.nextDouble();
        c = lerTeclado.nextDouble();
        delta = (b * b) - (4 * a * c);
        lerTeclado.close();
        if (a == 0 || delta < 0) {
            System.out.println("Impossivel calcular");
        } else {
            r1 = (-b + Math.sqrt(delta)) / (2 * a);
            r2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("R1 = " + String.format("%.5f", r1));
            System.out.println("R2 = " + String.format("%.5f", r2));
        }

    }
}
