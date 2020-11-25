package br.com.java.estruturadados.externcode;

public class AStringTest {

    public static void main(String[] args) {
        String names[] = {"japa", "maria" ,"jaha", "leticia"};

        for (String n : names) {
            if(n.startsWith("ja")) {
                System.out.println(n);
            }
        }

        for (String n : names) {
            if(n.endsWith("ia")) {
                System.out.println(n);
            }
        }
    }
}
