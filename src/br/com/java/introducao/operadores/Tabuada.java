package br.com.java.introducao.operadores;

public class Tabuada {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println("TABUADA: " + i);

            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " + " + j + "= " + (i + j));
                System.out.println(i + " - " + j + "= " + (i - j));
                System.out.println(i + " x " + j + "= " + (i * j));
                System.out.println(i + " / " + j + "= " + (i / j));
                System.out.println();

            }
            System.out.println("---------------");


        }
    }
}
