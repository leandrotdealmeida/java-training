package br.com.java.javacore.SStrings.tests;

public class StringBuilderTest {
    public static void main(String[] args) {
        String s = "Uma frase comum";
        StringBuffer sb = new StringBuffer(16);
        sb.append("def").insert(3,"gh1").reverse().delete(2,4);
        System.out.println(sb);
    }

}
