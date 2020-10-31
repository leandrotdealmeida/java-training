package br.com.java.introducao.operadores;

public class CalcularSalario {
    public static void main(String[] args) {
        float salario = 4600.50F;
        float valor = 0F;
        String porcentagem = "";

        if (salario > 4500) {
            valor = salario * 0.3F;
            porcentagem = "30%";

        } else {
            valor = salario * 0.15F;
            porcentagem = "15%";
        }
        System.out.println("VALOR "+ porcentagem + " = "+ valor);

    }
}
