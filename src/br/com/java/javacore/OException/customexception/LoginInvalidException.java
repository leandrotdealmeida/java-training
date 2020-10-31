package br.com.java.javacore.OException.customexception;

public class LoginInvalidException extends Exception {

    public LoginInvalidException(){
        super("Usuario ou Senha invalidos");
    }
}
