package br.com.java.introducao.listaViradoJiraya.operadores;

public class Ex7InverterResultado {
    public static void main(String[] args) {
        int x = 10,y = 12;
        int temp = x;
         x = y;
         y = temp;

        System.out.println(x + " e " + y );
    }
}
