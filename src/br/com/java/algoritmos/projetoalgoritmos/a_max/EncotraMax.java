package br.com.java.algoritmos.projetoalgoritmos.a_max;

public class EncotraMax {
    public static void main(String[] args) {
        MeuItem itens[] = new MeuItem[2];
        itens[0] = new MeuItem(12);
        itens[1] = new MeuItem(10);
        MeuItem max = (MeuItem) Max.max(itens, 2);
        System.out.println("Maior chave: " + max.chave);
    }
}
