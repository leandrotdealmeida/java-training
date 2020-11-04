package br.com.java.judgeonline;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import static java.util.Arrays.asList;

public class Sort {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner lerTeclado = new Scanner(System.in);
        int n1 = lerTeclado.nextInt();
        int n2 = lerTeclado.nextInt();
        int n3 = lerTeclado.nextInt();
        List<Integer> numerosSorted = asList(n1, n2, n3);
        numerosSorted.sort(Integer::compareTo);
        System.out.println(numerosSorted.get(0));
        System.out.println(numerosSorted.get(1));
        System.out.println(numerosSorted.get(2));
        System.out.println();
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
    }
}
