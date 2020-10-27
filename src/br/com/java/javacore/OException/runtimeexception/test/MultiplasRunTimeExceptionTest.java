package br.com.java.javacore.OException.runtimeexception.test;

import java.awt.*;
import java.io.IOException;
import java.sql.SQLException;

public class MultiplasRunTimeExceptionTest {
    public static void main(String[] args) {
        try {
            throw new IndexOutOfBoundsException();
        } catch (IllegalArgumentException | IndexOutOfBoundsException | ArithmeticException  e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        }

        System.out.println("Fim do programa");

        try {
            talvezLanceException();
        } catch (Exception e) {

        }
    }

    public static void talvezLanceException() throws SQLException, AWTException, IOException{

    }
}
