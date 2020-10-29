package br.com.java.padroesdeprojeto.bFactory;

import br.com.java.padroesdeprojeto.bFactory.interfaces.IConection;

public class App {

    public static void main(String[] args) {
        ConectionFabric fabric = new ConectionFabric();

        IConection mysql = fabric.getConection("MYSQL");
        mysql.conectar();
        mysql.desconectar();

        IConection mongo = fabric.getConection("MONGO");
        mongo.conectar();
        mongo.desconectar();

        IConection h2 = fabric.getConection("H2");
        h2.conectar();
        h2.desconectar();
    }
}
