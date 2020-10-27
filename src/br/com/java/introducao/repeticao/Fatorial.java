package br.com.java.introducao.repeticao;

public class Fatorial {
    public static void main(String[] args) {
        int fat = 1;
        int valor = 5; //ou qualquer outro valor que queira calcular;
        for( int i = 2; i <= valor; i++ )
        {
            fat *= i;
        }
        System.out.println( "O fatorial de " + valor + " é igual a " + fat );
    }

}
