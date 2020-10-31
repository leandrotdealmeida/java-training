package br.com.java.devsuperior.aulao2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile3 {
    public static void main(String[] args) {
        String path = "c:\\temp\\in.txt";

        List<Product> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            line = br.readLine();
            while (line != null) {
                String[] vect = line.split(",");
                String name = vect[0];
                Double price = Double.parseDouble(vect[1]);
                Integer qtde = Integer.parseInt(vect[2]);

                Product prod = new Product(name, price, qtde);
                list.add(prod);

                 line = br.readLine();
            }

            System.out.println("PRODUCTS: ");
            for(Product prod : list) {
                System.out.println(prod);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
