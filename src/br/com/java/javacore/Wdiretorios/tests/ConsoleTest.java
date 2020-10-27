package br.com.java.javacore.Wdiretorios.tests;

import java.io.Console;

public class ConsoleTest {
    public static void main(String[] args) {
        Console c = System.console();
        char[] pw = c.readPassword("%s", "pw: ");
        for(char pass : pw){
            c.format("%c ", pass);
        }
        c.format("\n");
        String texto;
        while(true){
            texto = c.readLine("%s", "Digite: ");
            c.format("Esse texto %s foi digitato", retorno(texto));
        }
    }

    public static String retorno(String arg1){
        return "entrada de dados: " + arg1;
    }
}
