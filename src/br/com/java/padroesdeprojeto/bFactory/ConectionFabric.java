package br.com.java.padroesdeprojeto.bFactory;

import br.com.java.padroesdeprojeto.bFactory.inter.impl.ConectionEmpty;
import br.com.java.padroesdeprojeto.bFactory.inter.impl.ConectionMongo;
import br.com.java.padroesdeprojeto.bFactory.inter.impl.ConectionMysql;
import br.com.java.padroesdeprojeto.bFactory.interfaces.IConection;

public class ConectionFabric {

    public IConection getConection(String motor) {
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
}
