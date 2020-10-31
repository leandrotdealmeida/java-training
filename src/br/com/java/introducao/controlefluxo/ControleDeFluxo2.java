package br.com.java.introducao.controlefluxo;

/**
 * Created by Meus Documentos on 11/09/2019.
 */
public class ControleDeFluxo2 {
    public static void main(String[] args) {
        byte dia = 7;

        switch (dia) {
            case 1:
            case 7:
                System.out.println("Final de Semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia Util");
                break;
            default:
                System.out.println("OPÇAO INEXISTENTE");
                break;


        }
    }
}
