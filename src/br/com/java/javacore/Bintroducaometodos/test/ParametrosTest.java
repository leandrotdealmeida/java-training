package br.com.java.javacore.Bintroducaometodos.test;

import br.com.java.javacore.Bintroducaometodos.classes.Calculadora;

public class ParametrosTest {
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        int num1 = 5, num2 = 10;
        cal.alteraValores(num1,num2);
        System.out.println(num1+ ", " + num2);
    }
}
