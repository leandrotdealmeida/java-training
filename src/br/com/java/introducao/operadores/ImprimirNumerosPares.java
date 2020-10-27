package br.com.java.introducao.operadores;

/**
 * Created by Meus Documentos on 13/09/2019.
 */
public class ImprimirNumerosPares {
    public static void main(String[] args) {
        int valor = 100;
      for(int i = 0; i <= valor; i++){
          if(i%2 == 0){
              System.out.println("PARES: "+ i);
          }

          if(i%2 != 0){
              System.out.println("IMPARES: " + i);
          }
      }





       /* int contador;
        int numerosPares = 0;
        for (int i = 0; i < 100000; i++) {
            contador = i % 2;
            if (contador == 0) {
                numerosPares += 2;
                System.out.println(numerosPares);
            }


        }*/

    }
}
