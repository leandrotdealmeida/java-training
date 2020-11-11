package br.com.java.padroesdeprojeto.cAbstractFactory;

import br.com.java.padroesdeprojeto.cAbstractFactory.interfaces.FabricaAbstrata;
import br.com.java.padroesdeprojeto.cAbstractFactory.interfaces.IConectionBD;
import br.com.java.padroesdeprojeto.cAbstractFactory.interfaces.IConectionREST;

public class App {

    public static void main(String[] args) {
        FabricaAbstrata fabricaBD = FabricaProductor.getFactory("BD");
        IConectionBD conectionBD = fabricaBD.getBD("MYSQL");

        conectionBD.conectar();

        FabricaAbstrata fabricaREST = FabricaProductor.getFactory("REST");
        IConectionREST conectionREST = fabricaREST.getRest("COMPRAS");

        conectionREST.leerURL("www.codestart.com.br");
    }
}
