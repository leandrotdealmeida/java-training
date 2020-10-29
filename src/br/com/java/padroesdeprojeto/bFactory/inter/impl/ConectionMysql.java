package br.com.java.padroesdeprojeto.bFactory.inter.impl;

import br.com.java.padroesdeprojeto.bFactory.interfaces.IConection;

public class ConectionMysql implements IConection {
    @Override
    public void conectar() {
        System.out.println("Conectou ao MYSQL");
    }

    @Override
    public void desconectar() {
        System.out.println("Desconectou do MYSQL");

    }
}
