package br.com.java.padroesdeprojeto.cAbstractFactory.interfaces;

public interface FabricaAbstrata {

    IConectionBD getBD(String motor);
    IConectionREST getRest(String area);
}
