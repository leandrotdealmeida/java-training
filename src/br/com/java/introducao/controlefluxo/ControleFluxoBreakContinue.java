package br.com.java.introducao.controlefluxo;

/**
 * Created by Meus Documentos on 14/09/2019.
 */
public class ControleFluxoBreakContinue {
    public static void main(String[] args) {
        //dado o valor de um carro descubra quantas vezes ele pode ser parcelado
        //Porem as parcelas nao podem ser menores que 1000
        double valorTotal = 30000;
        for(int parcela = 1; parcela <= valorTotal; parcela++){
            double valorParcela = valorTotal / parcela;
          /* primeiro código sujo double valorParcela = valorTotal / parcela;

            if(valorParcela >= 1000){
                System.out.println("Parcela "+ parcela + "R$" + valorParcela);
            }
            else {
                System.out.println("Saindo do laco");
            }
            System.out.println("Fora do laco");
            */
          // código limpo
            if(valorParcela < 1000){
                break;
            }

            System.out.println("Parcela "+ parcela + "R$" + valorParcela);
        }
    }
}
