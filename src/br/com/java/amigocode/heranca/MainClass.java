package br.com.java.amigocode.heranca;

public class MainClass {
    public static void main(String[] args) {

        Animal jay = new Monkey();
        System.out.println(jay.nLegs);
        ((Monkey)jay).saySome();

        Animal liz = new Lion();
        System.out.println(liz.nLegs);
    }
}
