package br.com.java.padroesdeprojeto.cAbstractFactory;

import br.com.java.padroesdeprojeto.cAbstractFactory.interfaces.FabricaAbstrata;

public class FabricaProductor {

    public static FabricaAbstrata getFactory(String tipoFabrica) {

        if (tipoFabrica.equalsIgnoreCase("BD")) {
            return new ConectionDBFabric();

        } else if (tipoFabrica.equalsIgnoreCase("REST")) {
            return new ConectionRESTFabric();
        }

        return null;
    }

}
