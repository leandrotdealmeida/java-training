package br.com.java.estruturadados.listas.listaEncadiada;

public class ListaDeEspera {
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.inserir(872);
        lista.inserir(172);
        lista.inserir(1872);
        lista.inserir(2);

        while(!lista.isEmpty()) {
            int e = lista.retirar();
            System.out.println("Retirei o elemento " + e);
        }
    }
}
