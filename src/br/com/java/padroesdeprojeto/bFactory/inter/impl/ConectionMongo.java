package br.com.java.padroesdeprojeto.bFactory.inter.impl;

import br.com.java.padroesdeprojeto.bFactory.interfaces.IConection;

public class ConectionMongo implements IConection {
    @Override
    public void conectar() {
        System.out.println("Conectou ao mongo");
    }

    @Override
    public void desconectar() {
        System.out.println("Desconectou do mongo");
    }
}
