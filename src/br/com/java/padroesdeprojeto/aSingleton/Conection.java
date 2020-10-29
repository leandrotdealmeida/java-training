package br.com.java.padroesdeprojeto.aSingleton;

public class Conection {

    // Declaração
    private static Conection instancia;
    // private static Conection instancia = new Conection();

    // para evitar instancia mediante operador "new"
    private Conection() {

    }

    // Para obter a instanvia unicamente pro este método
    // Note a palavra reservada "static" é possivel mediante Classe.metodo
    public static Conection getInstance() {
        if(instancia == null) {
            instancia = new Conection();
        }
        return instancia;
    }

    public void conectar() {
        System.out.println("Conectando ao banco de dados");
    }

    public void desconectar() {
        System.out.println("Desconectando do banco de dados");
    }
}
