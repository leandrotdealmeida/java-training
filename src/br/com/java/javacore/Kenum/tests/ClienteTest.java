package br.com.java.javacore.Kenum.tests;

import br.com.java.javacore.Kenum.classes.Cliente;
import br.com.java.javacore.Kenum.classes.TipoCiente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente c  = new Cliente("Junia", TipoCiente.PESSOA_FISICA, Cliente.TipoPagamento.APRAZO);
        System.out.println(TipoCiente.PESSOA_FISICA.getId());
        System.out.println(TipoCiente.PESSOA_JURIDICA.getId());
        System.out.println(c);
    }
}
