package br.com.java.javacore.Eblocodeinicializacao.testes;

import br.com.java.javacore.Eblocodeinicializacao.classes.Cliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        System.out.println("Exibindo parcelas");
        for(int parcela : cliente.getParcelas()){

            System.out.print(parcela + " ");
        }
    }
}
