package br.com.java.introducao.operadores;

public class ValorNumeroImpares {

    public static void main(String[] args) {
        int contador = 0, valor = 20;
        boolean teste = true;
        while (contador <= valor) {
            if (contador % 2 != 0) {
                System.out.println("Numeros Impares..." + contador);

            }
            contador += 1;


        }

    }
}
