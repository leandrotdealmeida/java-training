package br.com.java.introducao.listaViradoJiraya.operadores;

import java.util.Scanner;

public class Ex4ConversaoFahreCelsius {

    public static void main(String[] args) {
        float fahre = 0.0F;
        Scanner lerTeclado = new Scanner(System.in);
        System.out.println("Qual a temperatura em Fahrenheit: ");
        fahre = lerTeclado.nextFloat();

        System.out.println("A temperatura em celsius é: " + ((fahre - 32) * 5) / 9);
    }
}
