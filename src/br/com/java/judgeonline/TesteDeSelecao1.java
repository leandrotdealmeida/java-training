package br.com.java.judgeonline;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class TesteDeSelecao1 {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        int a,b,c,d;
        Scanner lerTeclado = new Scanner(System.in);
        a = lerTeclado.nextInt();
        b = lerTeclado.nextInt();
        c = lerTeclado.nextInt();
        d = lerTeclado.nextInt();

        if(b > c && d > a && (c + d > a + b) && c > 0 && d > 0 && a % 2 == 0){
            System.out.print("Valores aceitos\n");
        }
        else {
            System.out.print("Valores nao aceitos\n");
        }
        lerTeclado.close();
    }
}
