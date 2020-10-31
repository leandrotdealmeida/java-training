package br.com.java.java8.staticmethod;

public class CorredorTest {
    public static void main(String[] args) {
        double velocidade = Corredor.calculeVelocidade(5.0, 10.0);
        System.out.println(velocidade);

        // Não compila
      //  double velocidade2 = new Pessoa().calculeVelocidade(5.0, 10.0);
      //  System.out.println(velocidade2);
    }
}

class Pessoa implements Corredor{}
