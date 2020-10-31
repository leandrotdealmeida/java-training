package br.com.java.javacore.OException.checkedexception.test;

import br.com.java.javacore.OException.customexception.LoginInvalidException;

public class CustomExceptionTest {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidException e) {
            e.printStackTrace();
        }
    }

    public static void logar() throws LoginInvalidException {
        String usuarioBanco = "Goku";
        String senhaBanco = "111";
        String usuarioDigitado = "Goku";
        String senhaDigitada = "123";
        if(!usuarioBanco.equals(usuarioDigitado) || !senhaBanco.equals(senhaDigitada)){
            throw new LoginInvalidException();
        }else{
            System.out.println("Logado");
        }

    }
}
