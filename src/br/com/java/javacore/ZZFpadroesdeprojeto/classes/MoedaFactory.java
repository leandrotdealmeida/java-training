package br.com.java.javacore.ZZFpadroesdeprojeto.classes;

public class MoedaFactory {

    public static Moeda criarMoeda(Pais pais) {
        if(pais.equals(Pais.BRASIL)){
            return new Real();
        } else if(pais.equals(Pais.USA)){
            return new USDolar();
        }
        throw  new IllegalArgumentException("Não Existe esse pais");

    }
}
