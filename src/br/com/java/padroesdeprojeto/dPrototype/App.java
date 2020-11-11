package br.com.java.padroesdeprojeto.dPrototype;

import br.com.java.padroesdeprojeto.dPrototype.model.ContaFisicaImpl;

public class App {

    public static void main(String[] args) {
        ContaFisicaImpl contaSalvar = new ContaFisicaImpl();
        contaSalvar.setSaldo(200);

        ContaFisicaImpl contaSalvar2 = new ContaFisicaImpl();

        ContaFisicaImpl contaClonada = (ContaFisicaImpl) contaSalvar.clonar();

        System.out.println(contaSalvar);
        System.out.println(contaSalvar2);

//        if(contaClonada != null) {
//            System.out.println(contaClonada);
//        }
//
//        System.out.println(contaClonada == contaSalvar);
    }
}
