package br.com.java.javacore.Bintroducaometodos.test;

import br.com.java.javacore.Bintroducaometodos.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.somarDoisNumeros();
        calc.subtrairDoisNumeros();
        calc.multiplicarDoisNumeros(5,5);
        System.out.println(calc.divideDoisNumeros(4.0, 0));
        calc.imprimeDoisNumerosDivididos(20,0);

        int numeros[] = {1,2,3,4,5};
        calc.somaArray(numeros);
        calc.somaVarArgs(1,2,3,4,5);
    }
}
