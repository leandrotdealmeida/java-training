package br.com.java.amigocode.heranca;
//super class
abstract public class Animal {

    public int nLegs = 0;

    public Animal() { }

    public Animal(int nLegs) {
        numberLegs(nLegs);
    }

    //setter method
    public void numberLegs(int nLegs) {
        this.nLegs = nLegs;
    }

    //getter method
    public abstract int getLegs();

}
