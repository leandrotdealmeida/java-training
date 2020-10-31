package br.com.java.estruturadados.listas.listaEncadiada;

public class Lista {

    private Caixinha inicio;

    //criando lista vazia
    public Lista() {
        this.inicio = null;
    }

    public void inserir(int elemento) {
        //tenho que criar um nova caixinha
        Caixinha nova = new Caixinha();
        nova.setElemento(elemento); //inseri o elemento na Lista
        nova.setProximo(null); //depois delea não vem ninguem

        if(inicio == null) {  //vai se a 1ª caixinha?
            inicio = nova;
        }
        else {
            Caixinha aux;
            aux = inicio;
            while(aux.getProximo() != null) {
                aux = aux.getProximo();
            }
            aux.setProximo(nova);
        }
    }

    public int retirar() {
        // este método considera que a lista sempre tem elementos
        // alguém na aplicação precisa (antes de remover), testar se a lista não está vazia, ok?
        if(inicio != null) {
            Caixinha aux = inicio;
            int elemento = aux.getElemento();
            inicio = aux.getProximo();
            return elemento;
        } else{
            throw new RuntimeException("Lista vazia");
        }
    }

    public void listar() {
        if(inicio == null) {
            System.out.println("Nada a exibir - a lista está vazia!");
        }
        else {
            Caixinha aux = inicio;
            while(aux != null) {
                System.out.println("Elemento visto " + aux.getElemento());
                aux = aux.getProximo();
            }
        }
    }

    public boolean isEmpty() {
        return this.inicio == null;
    }
}
