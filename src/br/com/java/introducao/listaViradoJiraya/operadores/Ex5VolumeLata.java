package br.com.java.introducao.listaViradoJiraya.operadores;

import java.util.Scanner;

public class Ex5VolumeLata {
    public static void main(String[] args) {
        float raioCircunferenciaDaLata = 0.0F, alturaDaLata = 0.0F;
        System.out.println("Qual o raio e a altura da lata?: ");
        Scanner lerTeclado = new Scanner(System.in);
        raioCircunferenciaDaLata = lerTeclado.nextFloat();
        alturaDaLata = lerTeclado.nextFloat();

        System.out.println("O Volume é: " + 3.141592654 * (Math.pow(raioCircunferenciaDaLata, 2)) * alturaDaLata);
    }
}
