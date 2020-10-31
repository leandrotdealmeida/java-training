package br.com.java.javacore.Fmodificadorestatico.test;


import br.com.java.javacore.Fmodificadorestatico.classes.Cliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        System.out.println("Exibindo parcelas");
      //  for(int parcela : cliente.getParcelas()){

     //       System.out.print(parcela + " ");
   //     }
        System.out.println("Tamanho: "+ Cliente.getParcelas().length);
        System.out.println("Tamanho: "+ Cliente.getParcelas().length);
        System.out.println("Tamanho: "+ Cliente.getParcelas().length);

    }
}
