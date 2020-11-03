package br.com.java.padroesdeprojeto.cAbstractFactory;

import br.com.java.padroesdeprojeto.cAbstractFactory.impl.*;
import br.com.java.padroesdeprojeto.cAbstractFactory.interfaces.FabricaAbstrata;
import br.com.java.padroesdeprojeto.cAbstractFactory.interfaces.IConectionBD;
import br.com.java.padroesdeprojeto.cAbstractFactory.interfaces.IConectionREST;

public class ConectionRESTFabric implements FabricaAbstrata {

    @Override
    public IConectionREST getRest(String area) {
        if (area == null) {
            return new ConectionRestNoArea();
        }
        if(area.equalsIgnoreCase("COMPRAS")) {
            return new ConectionRestCompras();
        } else if (area.equalsIgnoreCase("VENTAS")) {
            return new ConectionRestVendas();
        }

        return new ConectionRestNoArea();
    }

    @Override
    public IConectionBD getBD(String motor) {
        return null;
    }


}
