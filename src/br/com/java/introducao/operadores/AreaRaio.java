package br.com.java.introducao.operadores;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Meus Documentos on 13/09/2019.
 */
public class AreaRaio {
    public static void main(String[] args) throws IOException{
        double raio;
        double n = 3.14159;
        double area;

        Scanner lerRaio = new Scanner(System.in);
        raio = lerRaio.nextDouble();
        area = n * (raio * raio);

        System.out.println("A=" + String.format("%.4f", area));

    }
}
