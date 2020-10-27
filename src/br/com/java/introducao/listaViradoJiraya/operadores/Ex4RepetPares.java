package br.com.java.introducao.listaViradoJiraya.operadores;

public class Ex4RepetPares {
    public static void main(String[] args) {
        for (int i = 0; i <= 100 ; i++) {
              int pares = i % 2;
              if(pares != 0) {
                  System.out.println(i);
              }

        }
    }
}
