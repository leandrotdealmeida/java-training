package br.com.java.javacore.Fmodificadorestatico.test;

import br.com.java.javacore.Fmodificadorestatico.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(220);
        Carro carro1 = new Carro("BMW", 280);
        Carro carro2 = new Carro("Mercedes", 270);
        Carro carro3 = new Carro("Calhambeque", 350);

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();

        System.out.println("##########################");


        carro1.imprime();
        carro2.imprime();
        carro3.imprime();

    }
}
