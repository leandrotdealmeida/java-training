package br.com.java.introducao.operadores;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        int idade, ano, restoAno, mes, restoMes, dia;
        Scanner ler = new Scanner(System.in);
        idade = ler.nextInt();

        ano = idade / 365;
        restoAno = idade % 365;

        mes = restoAno / 30;
        restoMes = restoAno % 30;

        dia = restoMes;
        ler.close();

        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dia + " dia(s)");

    }
}
