package br.com.java.judgeonline;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Media3 {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner lerTeclado = new Scanner(System.in);
        float  n1 = lerTeclado.nextFloat();
        float n2 = lerTeclado.nextFloat();
        float n3 = lerTeclado.nextFloat();
        float n4 = lerTeclado.nextFloat();
        float media = (n1 * 2 + n2 * 3 + n3 * 4 + n4 * 1) / 10;
        if(media >= 7.0) {
            System.out.println("Media: " + String.format("%.1f", media));
            System.out.println("Aluno aprovado.");
        } else if(media < 5.0) {
            System.out.println("Media: " + String.format("%.1f", media));
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Media: " + String.format("%.1f", media));
            System.out.println("Aluno em exame.");
            float ne = lerTeclado.nextFloat();
            System.out.println("Nota do exame: " + String.format("%.1f", ne));
            float mediaFinal = (media + ne) / 2;
            if(mediaFinal >= 5.0) {
                System.out.println("Aluno aprovado.");
                System.out.println("Media final: " + String.format("%.1f", mediaFinal));
            } else {
                System.out.println("Aluno reprovado.");
                System.out.println("Media final: " + String.format("%.1f", mediaFinal));
            }
        }
    }
}
