package br.com.java.amigocode.heranca;
//sub class
public class Monkey extends Animal {

    public Monkey() {
        super(2);
    }

    @Override
    public int getLegs() {
        return this.nLegs;
    }

    public void saySome() {
        System.out.println("Hello I am a monkey");
    }
}

