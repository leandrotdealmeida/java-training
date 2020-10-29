package br.com.java.padroesdeprojeto.aSingleton;

public class App {

    public static void main(String[] args) {
        // Intanciação por construtor proibido por ser private
       //Conection c = new Conection();
        Conection c = Conection.getInstance();
        c.conectar();
        c.desconectar();

//        Conection c1 = new Conection();
//        c1.conectar();
//        c1.desconectar();

        boolean conferirIntancia = c instanceof Conection;
        System.out.println(conferirIntancia);
    }
}
