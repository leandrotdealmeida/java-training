package br.com.java.introducao.operadores;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class DistanciaEntreDoisPontos {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        float x1,x2,y1,y2;
        Scanner ler = new Scanner(System.in);
        x1 = ler.nextFloat();
        y1 = ler.nextFloat();
        x2 = ler.nextFloat();
        y2 = ler.nextFloat();
        ler.close();
        System.out.println(String.format("%.4f",Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2))));
    }
}
