package br.com.java.judgeonline;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Lanche {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        int codigo, quantidade;
        codigo = in.nextInt();
        quantidade = in.nextInt();
        if (codigo == 1)
            System.out.println("Total: R$ " + String.format("%.2f", quantidade * 4.0));
        if (codigo == 2)
            System.out.println("Total: R$ " + String.format("%.2f", quantidade * 4.50));
        if (codigo == 3)
            System.out.println("Total: R$ " + String.format("%.2f", quantidade * 5.00));
        if (codigo == 4)
            System.out.println("Total: R$ " + String.format("%.2f", quantidade * 2.00));
        if (codigo == 5)
            System.out.println("Total: R$ " + String.format("%.2f", quantidade * 1.50));
    }

}
