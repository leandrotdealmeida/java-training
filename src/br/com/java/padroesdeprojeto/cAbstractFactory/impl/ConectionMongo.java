package br.com.java.padroesdeprojeto.cAbstractFactory.impl;

import br.com.java.padroesdeprojeto.cAbstractFactory.interfaces.IConectionBD;

public class ConectionMongo implements IConectionBD {
    @Override
    public void conectar() {
        System.out.println("Conectou ao mongo");
    }

    @Override
    public void desconectar() {
        System.out.println("Desconectou do mongo");
    }
}
