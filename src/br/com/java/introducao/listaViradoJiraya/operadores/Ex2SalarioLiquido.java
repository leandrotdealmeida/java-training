package br.com.java.introducao.listaViradoJiraya.operadores;

import java.util.Scanner;

public class Ex2SalarioLiquido {
    public static void main(String[] args) {
        float  valorHoraTrabalho = 0.0F, percentualDesconto = 0.0F;

        float horasTrabalhadas = 0.0F;

        System.out.println("Digite as horas trabalhadas, o valor hora e o percentual de desconto: ");
        Scanner lerTeclado = new Scanner(System.in);
        horasTrabalhadas = lerTeclado.nextFloat();
        valorHoraTrabalho = lerTeclado.nextFloat();
        percentualDesconto = lerTeclado.nextFloat();
        float salarioBase = horasTrabalhadas * valorHoraTrabalho;
        float totalDesconto =  (percentualDesconto / 100 ) * (horasTrabalhadas * valorHoraTrabalho);
        float salarioLiquido = salarioBase - totalDesconto;

        System.out.println("Salário Base: "+ salarioBase );
        System.out.println("Salário Liquido: "+ salarioLiquido );




    }
}
