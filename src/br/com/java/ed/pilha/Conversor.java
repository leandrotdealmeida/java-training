package br.com.java.ed.pilha;

public class Conversor {
    public static void main(String[] args) {
        int numero = 172;
        Pilha p = new Pilha();

        int resto;

        //fase 1: empilhamento dos restos
        while(numero != 0){
            resto = numero % 2; //pego o resto da divisao desde numero por 2(vale 0 ou 1)
            p.push(resto); // armazeno na pilha
            numero = numero / 2; //gero um novo numero resultado da divisao por 2
        }

        //fase 2 = exibicao dos restos
        while(!p.isEmpty()){
            resto = p.pop();      //remove da pilha(sempre o que esta no topo)
            System.out.println(resto);
        }
        System.out.println("\n Fim do programa");
    }
}
