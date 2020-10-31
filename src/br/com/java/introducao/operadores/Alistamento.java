package br.com.java.introducao.operadores;

public class Alistamento {
    public static void main(String[] args) {
        char sexo = 'F';
        int idade = 20;

        if (sexo == 'M' && idade >= 18)
            System.out.println("Alistamento obrigatório");
        else if ((sexo == 'M' || sexo == 'F' ) && idade < 18)
            System.out.println("Alistamento não permitido");
        else if(sexo == 'F' && idade >= 18)
            System.out.println("Voce deseja se alistar?");

    }
}
