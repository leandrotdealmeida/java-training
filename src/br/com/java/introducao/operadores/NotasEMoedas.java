package br.com.java.introducao.operadores;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class NotasEMoedas {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        float valor = 0.0F;
        int numeroNotas = 0, numeroMoedas = 0;
        Scanner lerTeclado = new Scanner(System.in);
        valor = lerTeclado.nextFloat();
        float[] notas = {100, 50, 20, 10, 5, 2};
        float[] moedas = {1, 0.50F, 0.25F, 0.10F, 0.05F, 0.01F};

        if (valor >= 0 && valor <= 1000000.00) {
            System.out.println("NOTAS:");
            for (float num : notas) {
                numeroNotas = (int) (valor / num);
                valor = valor % num;

                System.out.println(numeroNotas + " nota(s) de R$ " + String.format("%.2f", num));

            }
            System.out.println("MOEDAS: ");
            for (float num2 : moedas) {
                numeroMoedas = (int) (valor / num2);
                valor = valor % num2;

                System.out.println(numeroMoedas + " moeda(s) de R$ " + String.format("%.2f", num2));

            }
        }
        lerTeclado.close();
    }
}
