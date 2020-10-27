package br.com.java.javacore.ZZIdefault.interfaces;

public interface B extends A {

    default void oi() {
        System.out.println("Dentro do oi de B");
    }

}
