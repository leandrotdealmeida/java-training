package br.com.java.introducao.listaViradoJiraya.operadores;

import java.util.Scanner;

public class Ex1AreaCirculo {
    public static void main(String[] args) {
        int raio = 0;
        Scanner lerTeclado = new Scanner(System.in);
        raio = lerTeclado.nextInt();

        System.out.println("Área do Circulo: "+ 3.141592654 * (Math.pow(raio,2)));
    }
}
