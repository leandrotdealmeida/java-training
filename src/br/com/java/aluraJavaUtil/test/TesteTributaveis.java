package br.com.java.aluraJavaUtil.test;

import br.com.java.aluraJavaUtil.modelo.CalculadorDeImposto;
import br.com.java.aluraJavaUtil.modelo.ContaCorrente;
import br.com.java.aluraJavaUtil.modelo.SeguroDeVida;

//classe Teste
public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc= new ContaCorrente(222, 333);
		cc.deposita(100.0);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		calc.registra(cc);
		calc.registra(seguro);
		
		System.out.println(calc.getTotalImposto());

	}

}
