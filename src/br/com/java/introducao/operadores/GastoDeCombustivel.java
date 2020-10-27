package br.com.java.introducao.operadores;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class GastoDeCombustivel {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        int tempo = 0, velocidadeMedia = 0;
        Scanner ler = new Scanner(System.in);
        tempo = ler.nextInt();
        velocidadeMedia = ler.nextInt();
        ler.close();

        System.out.println(String.format("%.3f", (float) tempo * velocidadeMedia / 12));
    }
}
