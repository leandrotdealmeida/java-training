package br.com.java.aluraJavaUtil.test.util;

import br.com.java.aluraJavaUtil.modelo.Conta;
import br.com.java.aluraJavaUtil.modelo.ContaCorrente;

import java.util.ArrayList;


public class TesteArrayListEquals {

	public static void main(String[] args) {

		//Generics
		ArrayList<Conta> lista = new ArrayList<Conta>();

		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);

		System.out.println(cc.equals(cc2));

		Conta cc3 = new ContaCorrente(22, 22);

		boolean existe = lista.contains(cc3);

		System.out.println("Já existe? " + existe);

		for(Conta conta : lista) {
			if(conta.equals(cc3)) {
				System.out.println("Já tenho essa referencia");
			}
		}
		for(Conta conta : lista) {
			System.out.println(conta);
		}	
		
	}
}
