package br.com.java.introducao.listaViradoJiraya.operadores;

public class Ex5RepetFibonacciRecursiva {

    static long fibo(int n){
        if (n < 2){
            return n;
        }else{
            return fibo(n -1) + fibo (n -2);
        }
    }
    public static void main(String[] args) {

        for (int i = 0; i < 15; i++) {
            System.out.print("(" + i + "):" + Ex5RepetFibonacciRecursiva.fibo(i) + "\t");

        }
    }
}
