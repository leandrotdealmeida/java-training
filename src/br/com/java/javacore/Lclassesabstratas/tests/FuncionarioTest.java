package br.com.java.javacore.Lclassesabstratas.tests;

import br.com.java.javacore.Lclassesabstratas.classes.Gerente;
import br.com.java.javacore.Lclassesabstratas.classes.Vendedor;

public class FuncionarioTest {
    public static void main(String[] args) {
        Gerente ger = new Gerente("JUca", "33212", 5000);
        ger.calculaSalario();
        Vendedor vend = new Vendedor("Camila","324232" , 1500, 5000 );
        vend.calculaSalario();
        System.out.println(ger);
        System.out.println(vend);
    }
}
