package br.com.java.introducao.arrays;

import java.util.Scanner;

public class ArrayMultiDimensional {
    public static void main(String[] args) {
        int[][] arrayMulti = new int[2][2];

        arrayMulti[0][0] = 10;
        arrayMulti[0][1] = 20;
        arrayMulti[1][0] = 30;
        arrayMulti[1][1] = 40;

        Scanner lerTeclado = new Scanner(System.in);
        for (int i = 0; i < arrayMulti.length; i++) {
            for (int j = 0; j < arrayMulti[i].length; j++) {
                System.out.println("Digite o valor da posição: [" + i + "][" + j + "]");
                arrayMulti[i][j] = lerTeclado.nextInt();
            }
        }

        for (int i = 0; i < arrayMulti.length ; i++) {
            for (int j = 0; j < arrayMulti[i].length; j++) {
                System.out.println("["+ i + "]["+ j + "]= " + arrayMulti[i][j]);

            }

        }
    }
}
