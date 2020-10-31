package br.com.java.introducao.operadores;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class ConsumoCarro {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        int x;
        float y;
        Scanner ler = new Scanner(System.in);
        x = ler.nextInt();
        y = ler.nextFloat();
        ler.close();
        DecimalFormat df  = new DecimalFormat("#.###");
        System.out.println(Float.valueOf(df.format(x/y)) + " km/l" );

    }
}
