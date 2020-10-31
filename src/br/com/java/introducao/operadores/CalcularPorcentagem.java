package br.com.java.introducao.operadores;

/**
 * Created by Meus Documentos on 16/09/2019.
 */
public class CalcularPorcentagem {
    public static void main(String[] args) {
        float salario = 2500.00F;
        float porcentagem = 30L;
        float resultado = salario * (porcentagem / 100);
        System.out.println(resultado);
    }
}
