package br.com.java.javacore.Bintroducaometodos.classes;

public class Calculadora {

    public void somarDoisNumeros() {
        System.out.println(5 + 5);
    }

    public void subtrairDoisNumeros() {
        System.out.println(5 - 5);
    }

    public void multiplicarDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
        return 0;
    }

    public void imprimeDoisNumerosDivididos(double num1, double num2) {
        if (num2 != 0) {
            System.out.println(num1 / num2);
            return;
        }
        System.out.println("Não é possivel dividir por 0");
    }

    public void alteraValores(int a, int b) {
        a = 30;
        b = 40;
        System.out.println(a + " , " + b);
    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

}
