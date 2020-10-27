package br.com.java.introducao.operadores;
import java.util.Scanner;
public class EntrarEndereco {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        String nome = entrada.nextLine();
        System.out.print("Digite a cidade: ");
        String cidade = entrada.nextLine();
        System.out.println();
        System.out.println("Nome: " + nome);
        System.out.println("Cidade: " + cidade);
        entrada.close();
    }
}