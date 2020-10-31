package br.com.java.introducao.operadores;

import java.io.IOException;
import java.util.Locale;

public class CedulasComRepeticao {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        int valor = 576, numeroNotas = 0;
        int[] cedulas = {100, 50, 20, 10, 5};

        for (int num : cedulas) {
            numeroNotas = valor / num;
            valor = valor % num;
            System.out.println(numeroNotas + " nota(s) de "+ num + ",00");
        }


    }
}
