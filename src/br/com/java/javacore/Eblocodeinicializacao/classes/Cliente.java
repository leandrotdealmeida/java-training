package br.com.java.javacore.Eblocodeinicializacao.classes;

public class Cliente {
    //1 - Alocado espaço na memória para o objeto que será criado
    //2 - Cada atributoe classe é criado e inicializado com seus valores defaultou valores explicitos
    //3 - BLoco de inicializacao
    //4 - O Construtor é executado

    private int[] parcelas ;

    {
        parcelas = new int[100];
        System.out.println("Dentro do bloco de inicializacao");
        for (int i = 1; i <= 100 ; i++) {
            parcelas[i-1] = i;

        }
    }

    public Cliente() {

    }

    public int[] getParcelas() {
        return parcelas;
    }

    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }
}
