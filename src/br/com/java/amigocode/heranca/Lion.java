package br.com.java.amigocode.heranca;
//sub class
public class Lion extends Animal {

    @Override
    public int getLegs() {
        return 0;
    }

    public Lion() {
        super(4);
    }
}
