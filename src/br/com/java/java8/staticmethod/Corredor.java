package br.com.java.java8.staticmethod;

public interface Corredor {
    static double calculeVelocidade(double tempo, double distancia){
        return distancia/tempo;
    }
}
