package br.com.java.javacore.SStrings.tests;

public class StringTest {
    public static void main(String[] args) {
        String nome = "Leandro";
        nome = nome.concat(" Almeida"); // nome += "Almeida";
        String nome2 = new String("Japa"); //1 variavel de referencia, 2 - um objeto do tipo String, 3 Uma String no pool de String
        System.out.println(nome + nome2);

        String teste = "Goku";
        String teste2 = "  01234456789   ";
        System.out.println(teste.charAt(3));
        System.out.println(teste.equalsIgnoreCase(teste2));
        System.out.println(teste.length());
        System.out.println(teste.replace('a', 'b')) ;
        System.out.println(teste2.toLowerCase());
        System.out.println(teste2.toUpperCase());
        System.out.println(teste2.substring(0,5));
        System.out.println(teste2.trim());
    }
}
