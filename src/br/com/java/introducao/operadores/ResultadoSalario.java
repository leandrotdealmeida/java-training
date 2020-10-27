package br.com.java.introducao.operadores;

/**
 * Created by Meus Documentos on 17/09/2019.
 */
public class ResultadoSalario {
    public static void main(String[] args) {
        double salario = 5000, resultado = salario * 0.3;


        System.out.println("Porcentagem 30%: " + resultado);

        resultado = salario * 0.15;
        System.out.println("Porcentagem 15%: " + resultado);

        resultado = salario * 0.05;
        System.out.println("Porcentagem 5%: " + resultado);
    }
}
