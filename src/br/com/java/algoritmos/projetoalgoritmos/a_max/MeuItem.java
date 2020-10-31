package br.com.java.algoritmos.projetoalgoritmos.a_max;

public class MeuItem implements Item {
    public int chave;

    public MeuItem(int chave) {
        this.chave = chave;
    }

    @Override
    public int compara(Item it) {
        MeuItem item = (MeuItem) it;
        if(this.chave < item.chave) return -1;
        else if(this.chave > item.chave) return 1;
        return 0;
    }
}
