package br.com.java.introducao.arrays;

import java.util.Scanner;

public class Aula03ExArrays {
    public static void main(String[] args) {
        int[] array1 = new int[3];
        int[] array2 = new int[3];
        int[] array3 = new int[3];
        Scanner lerTeclado = new Scanner(System.in);

        for(int i = 0; i < array1.length; i++){
            System.out.println("Vetor 1, posicao " + i + ": ");
            array1[i] = lerTeclado.nextInt();
        }
        for(int i = 0; i < array2.length; i++){
            System.out.println("Vetor 2, posicao " + i + ": ");
            array2[i] = lerTeclado.nextInt();
        }
        System.out.println("Vetor 3, multiplicado ");
        for(int i = 0; i < array3.length; i++){
            array3[i] = array2[i] * array1[i];
            System.out.print(array3[i] + " ");
        }
    }
}
