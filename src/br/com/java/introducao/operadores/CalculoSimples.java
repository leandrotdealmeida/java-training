package br.com.java.introducao.operadores;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Meus Documentos on 18/09/2019.
 */
public class CalculoSimples {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        int codPeca1, codPeca2, numeroPeca1, numeroPeca2;
        double valorPeca1, valorPeca2;
        Scanner ler = new Scanner(System.in);
        codPeca1 = ler.nextInt();
        numeroPeca1 = ler.nextInt();
        valorPeca1 = ler.nextDouble();
        codPeca2 = ler.nextInt();
        numeroPeca2 = ler.nextInt();
        valorPeca2 = ler.nextDouble();
        ler.close();

        System.out.printf("VALOR A PAGAR: R$ %.2f\n",
                (numeroPeca1 * valorPeca1) + (numeroPeca2 * valorPeca2));


    }
}
