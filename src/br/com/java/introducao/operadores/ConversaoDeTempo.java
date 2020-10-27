package br.com.java.introducao.operadores;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class ConversaoDeTempo {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        int n, horas, minutos, segundos, rseg, rmnt, rhrs;
        Scanner ler = new Scanner(System.in);
        n = ler.nextInt();

        horas = n / 3600;
        rhrs = n % 3600;

        minutos = rhrs / 60;
        rmnt = rhrs % 60;

        segundos = rmnt % 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);

    }
}
