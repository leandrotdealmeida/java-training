package br.com.java.devsuperior.OO.quartos.application;

import br.com.java.devsuperior.OO.quartos.entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent rent[] = new Rent[10];
        System.out.println("How many rooms will be rented?");
        int qtde = sc.nextInt();

        for (int i = 0; i < qtde; i++) {
            System.out.println();
            System.out.println("Rent #"+ i + ":");
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.println("Email: ");
            String email = sc.nextLine();

            System.out.println("Room: ");
            int room = sc.nextInt();

            rent[room] = new Rent(name, email);

        }

        System.out.println();
        System.out.println("Busy rooms");
        for (int i = 0; i < 10; i++) {
            if(rent[i] != null){
                System.out.println(i + ": " + rent[i]);
            }

        }
        sc.close();
    }
}
