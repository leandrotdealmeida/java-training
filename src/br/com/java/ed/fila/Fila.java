package br.com.java.ed.fila;

public class Fila {
    private int[] valores;
    private int inicio;
    private int fim;
    private int total;

    public Fila(){
        valores = new int[10];
        inicio = 0;
        fim = 0;
        total = 0;
    }

    public void inserir(int element){
        valores[fim] = element;
        fim = (fim + 1) % valores.length;
        total++;
    }

    public int retirar(){
        int element = valores[inicio];
        inicio = (inicio + 1) % 10;
        total--;
        return element;
    }

    public boolean isEmpty(){
        return (total == 0);
    }

    public boolean isFull(){
        return (total == 10);
    }
}
