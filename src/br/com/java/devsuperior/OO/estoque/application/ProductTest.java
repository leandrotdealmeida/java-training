package br.com.java.devsuperior.OO.estoque.application;

import br.com.java.devsuperior.OO.estoque.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class ProductTest {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data:");
        Product product = new Product();
        System.out.println("Name: ");
        product.name = sc.nextLine();
        System.out.println("Price:");
        product.price = sc.nextDouble();
        System.out.println("Quantity in stock: ");
        product.quantity = sc.nextInt();

        System.out.println();
        System.out.println("Product data: "+ product);
        System.out.println("Enter the number of products to be added in stock: ");
        int qtd = sc.nextInt();
        product.addProducts(qtd);
        System.out.println("Updated data: "+ product);
        System.out.println("Enter the number of products to be removed from stock: ");
        qtd = sc.nextInt();
        product.removeProducts(qtd);
        System.out.println("Updated data: "+ product);

        sc.close();

    }
}
