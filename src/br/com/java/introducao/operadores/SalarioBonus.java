package br.com.java.introducao.operadores;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Meus Documentos on 18/09/2019.
 */
public class SalarioBonus {
    public static void main(String[] args) throws IOException{
        Locale.setDefault(Locale.US);
        String nome;
        double salario, totalVendas;
        Scanner ler = new Scanner(System.in);
        nome = ler.next();
        salario = ler.nextDouble();
        totalVendas = ler.nextDouble();

        System.out.printf("TOTAL = R$ %.2f\n", salario + (totalVendas * 0.15));

    }
}
