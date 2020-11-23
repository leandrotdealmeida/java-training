package br.com.java.estruturadados.busca.menorpreco;

public class TestaMenorPreco {
    public static void main(String[] args) {

        Produto produtos[] = {
                new Produto("Lamborguini", 1000000),
                new Produto("Jipe", 46000),
                new Produto("Brasilia", 16000),
                new Produto("Smart", 46000),
                new Produto("Fusca", 17000)
        };

        int maisBarato = getMaisBarato(produtos,0, 4);
        System.out.println(maisBarato);
        System.out.println("O	carro "+ produtos[maisBarato].getNome()  +" mais	barato	custa " + produtos[maisBarato].getPreco());


    }

    private static int getMaisBarato(Produto[] produtos,int inicio, int termino) {
        int maisBarato = inicio;
        for (int atual = inicio; atual <= termino; atual++) {
            if (produtos[atual].getPreco() < produtos[maisBarato].getPreco()) {
                maisBarato = atual;
            }
        }
        return maisBarato;
    }
}
