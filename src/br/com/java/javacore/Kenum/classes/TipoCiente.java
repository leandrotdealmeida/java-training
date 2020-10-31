package br.com.java.javacore.Kenum.classes;

public enum TipoCiente {
    //constant specific class body
    //corpo de class esprecifico contante
    PESSOA_FISICA(1, "Pessoa Fisica"), PESSOA_JURIDICA(2, "Pessoa Juridica"){
        public String getId(){
            return "B";
        }
    };

    private int tipo;
    private String nome;

    TipoCiente(int tipo, String nome) {
        this.tipo = tipo;
        this.nome = nome;
    }

    public String getId(){
        return "A";
    }

    public int getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }
}
