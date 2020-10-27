package br.com.java.devsuperior.OO.triangle.application;

import br.com.java.devsuperior.OO.triangle.entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle triangleX, triangleY;
        System.out.println("Enter the measures of Triangle X: ");
        triangleX = new Triangle();
        triangleX.a = sc.nextDouble();
        triangleX.b = sc.nextDouble();
        triangleX.c = sc.nextDouble();

        System.out.println("Enter the measures og Triangle Y:");
        triangleY = new Triangle();
        triangleY.a = sc.nextDouble();
        triangleY.b = sc.nextDouble();
        triangleY.c = sc.nextDouble();

        double p = triangleX.calculaMedia();
        double areaX = triangleX.calculaArea();

        p = triangleY.calculaMedia();
        double areaY = triangleY.calculaArea();

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if(areaX > areaY) {
            System.out.println("Large area: X");
        }
        else {
            System.out.println("Larger area: Y");
        }

    }
}
