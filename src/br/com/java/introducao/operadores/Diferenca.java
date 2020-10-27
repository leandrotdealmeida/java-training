package br.com.java.introducao.operadores;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Meus Documentos on 17/09/2019.
 */
public class Diferenca {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        int a, b, c, d, media;
        Scanner ler = new Scanner(System.in);
        a = ler.nextInt();
        b = ler.nextInt();
        c = ler.nextInt();
        d = ler.nextInt();

        System.out.printf("DIFERENCA = %d\n", (a * b - c * d));

    }

}
