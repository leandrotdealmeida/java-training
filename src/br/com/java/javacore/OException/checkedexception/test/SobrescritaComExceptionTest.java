package br.com.java.javacore.OException.checkedexception.test;

import br.com.java.javacore.OException.checkedexception.classes.Funcionario;
import br.com.java.javacore.OException.checkedexception.classes.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest {
    public static void main(String[] args) throws FileNotFoundException {
        Funcionario f  =  new Funcionario();
        Pessoa p = new Pessoa();

        f.salvar();
    }
}
