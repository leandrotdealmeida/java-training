package br.com.java.introducao.listaViradoJiraya.operadores;

import java.util.Scanner;

public class Ex3ConversaoCeliusFahre {

    public static void main(String[] args) {
        float celsius = 0.0F;
        Scanner lerteclado = new Scanner(System.in);
        System.out.println("Qual a temperatura em Celsius?: ");
        celsius = lerteclado.nextFloat();

        System.out.println("A temperatura em Fahrenheit é: " + (9 * celsius) / 5);


    }
}
