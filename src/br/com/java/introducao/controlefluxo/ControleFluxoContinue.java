package br.com.java.introducao.controlefluxo;

/**
 * Created by Meus Documentos on 14/09/2019.
 */
public class ControleFluxoContinue {
    public static void main(String[] args) {
        //dado o valor de um carro descubra quantas vezes ele pode ser parcelado
        //Porem as parcelas nao podem ser menores que 1000
        double valorTotal = 30000;
        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;

            if (valorParcela < 1000) {
                continue;
            }
           /* if (valorParcela >= 1000) {
                System.out.println("Parcela " + parcela + "R$" + valorParcela);
            }
            */
            System.out.println("Parcela " + parcela + "R$" + valorParcela);
            System.out.println("Consumindo memoria");
        }
    }
}
