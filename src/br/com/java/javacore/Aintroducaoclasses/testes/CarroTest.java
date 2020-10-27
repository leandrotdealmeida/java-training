package br.com.java.javacore.Aintroducaoclasses.testes;

import br.com.java.javacore.Aintroducaoclasses.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.modelo = "Fusca";
        carro.placa = "WDC1230";
        carro.velocidadeMax = 250f;

        System.out.println(carro.modelo);
        System.out.println(carro.placa);
        System.out.println(carro.velocidadeMax);


    }
}
