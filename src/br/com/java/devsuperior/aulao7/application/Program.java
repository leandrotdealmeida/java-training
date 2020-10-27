package br.com.java.devsuperior.aulao7.application;

import br.com.java.devsuperior.aulao7.entities.Company;
import br.com.java.devsuperior.aulao7.entities.Individual;
import br.com.java.devsuperior.aulao7.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of taxpayers: ");
        int n = sc.nextInt();

        List<TaxPayer> list = new ArrayList<TaxPayer>();

        for (int i = 0; i < n; i++) {
            System.out.println("TaxPayer #" + i + " data:");
            System.out.println("Individualor Company (i/c)? ");
            char type = sc.next().charAt(0);
            System.out.println("Name: ");
            String name = sc.next();
            System.out.println("Anual income: ");
            Double anualIncome = sc.nextDouble();
            if(type == 'i') {
                System.out.println("Health expenditures: ");
                Double healthExpenditures = sc.nextDouble();
                list.add(new Individual(name, anualIncome, healthExpenditures));
            }
            else {
                System.out.println("Number of employees: ");
                Integer numberOfEmployers = sc.nextInt();
                list.add(new Company(name, anualIncome, numberOfEmployers));
            }
        }
        System.out.println();
        System.out.println("TAXES PAID");
        for (TaxPayer tp : list) {
            System.out.println(tp.getName() + ": $" + String.format("%.2f", tp.tax()));
        }
        System.out.println();
        double sum = 0.0;
        for (TaxPayer tp : list) {
            sum += tp.tax();
        }
        System.out.println("TOTAL TAX: $ " + String.format("%.2f", sum));



        sc.close();
    }
}
