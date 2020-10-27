package br.com.java.javacore.UExpressoesRegulares;

public class TokensTest {
    public static void main(String[] args) {
        String str = "leandro9 larissa1 Joana1 Vanessa9 Carla";
        String[] tokens = str.split("\\d");
        for(String arr : tokens){
            System.out.println(arr.trim());
        }
    }
}
