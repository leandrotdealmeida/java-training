package br.com.java.padroesdeprojeto.cAbstractFactory.impl;

import br.com.java.padroesdeprojeto.cAbstractFactory.interfaces.IConectionBD;

public class ConectionEmpty implements IConectionBD {

    @Override
    public void conectar() {
        System.out.println("Not specific conection");
    }

    @Override
    public void desconectar() {
        System.out.println("Not specific conection");
    }
}
