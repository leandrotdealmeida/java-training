package br.com.java.introducao.operadores;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Distancia {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        int km;
        Scanner ler = new Scanner(System.in);
        km = ler.nextInt();
        ler.close();

        System.out.println(km * 2 + " minutos");
    }
}
