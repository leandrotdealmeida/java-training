package br.com.java.padroesdeprojeto.cAbstractFactory.impl;

import br.com.java.padroesdeprojeto.cAbstractFactory.interfaces.IConectionREST;

public class ConectionRestCompras implements IConectionREST {

    @Override
    public void leerURL(String url) {
        System.out.println("Conectando a " + url);
    }
}
