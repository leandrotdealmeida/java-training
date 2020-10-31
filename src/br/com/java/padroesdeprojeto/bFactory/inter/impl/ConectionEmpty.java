package br.com.java.padroesdeprojeto.bFactory.inter.impl;

import br.com.java.padroesdeprojeto.bFactory.interfaces.IConection;

public class ConectionEmpty implements IConection {

    @Override
    public void conectar() {
        System.out.println("Not specific conection");
    }

    @Override
    public void desconectar() {
        System.out.println("Not specific conection");
    }
}
