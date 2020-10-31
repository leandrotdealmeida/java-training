package br.com.java.javacore.Fmodificadorestatico.classes;

public class Cliente {
    //0 - BLoco de inicializacao estático é executado quando a JVM carregar a classe(é executado apenas uma vez)
    //1 - Alocado espaço na memória para o objetoque será criado
    //2 - Cada atributoe classe é criado e inicializado com seus valores defaultou valores explicitos
    //3 - BLoco de inicializacao
    //4 - O Construtor é executado

    private static int[] parcelas;

    static {
        parcelas = new int[100];
        System.out.println("Dentro do bloco de inicializacao");
        for (int i = 1; i <= 100; i++) {
            parcelas[i - 1] = i;

        }
    }

    static {
        System.out.println("dentro do blocco estático 2");
    }

    static {
        System.out.println("dentro do blocco estático 3");
    }

    public Cliente() {

    }

    public static int[] getParcelas() {
        return parcelas;
    }


}
