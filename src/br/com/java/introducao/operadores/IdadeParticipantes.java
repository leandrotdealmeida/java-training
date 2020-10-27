package br.com.java.introducao.operadores;

public class IdadeParticipantes {

    public static void main(String[] args) {
        String nome = "Leandro";
        int idade = 13;

        if (idade < 11) System.out.println(nome + " participará da categoria infantil");
        else if (idade > 10 && idade <= 15) System.out.println(nome + " participaráa categoria Juvenil");
        else if (idade > 15 && idade <= 19) System.out.println(nome + " participará da categoria Pré- Adulto");
        else System.out.println(nome + " participará da categoria Adulto");
    }
}
