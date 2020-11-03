package br.com.java.padroesdeprojeto.cAbstractFactory;

import br.com.java.padroesdeprojeto.cAbstractFactory.impl.ConectionEmpty;
import br.com.java.padroesdeprojeto.cAbstractFactory.impl.ConectionMongo;
import br.com.java.padroesdeprojeto.cAbstractFactory.impl.ConectionMysql;
import br.com.java.padroesdeprojeto.cAbstractFactory.interfaces.FabricaAbstrata;
import br.com.java.padroesdeprojeto.cAbstractFactory.interfaces.IConectionBD;
import br.com.java.padroesdeprojeto.cAbstractFactory.interfaces.IConectionREST;

public class ConectionDBFabric implements FabricaAbstrata {

    @Override
    public IConectionBD getBD(String motor) {
        if(motor == null) {
            return new ConectionEmpty();
        }

        if(motor.equalsIgnoreCase("MYSQL")) {
            return new ConectionMysql();
        } else if (motor.equalsIgnoreCase("MONGO")) {
            return new ConectionMongo();
        }

        return new ConectionEmpty();
    }

    @Override
    public IConectionREST getRest(String area) {
        return null;
    }
}
