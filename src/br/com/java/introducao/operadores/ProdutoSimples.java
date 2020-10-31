package br.com.java.introducao.operadores;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Meus Documentos on 14/09/2019.
 */
public class ProdutoSimples {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        int a, b, prod;
        Scanner ler = new Scanner(System.in);
        a = ler.nextInt();
        b = ler.nextInt();
        prod = a * b;
        ler.close();

        System.out.printf("PROD = %d\n", prod);
    }
}
