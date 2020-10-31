package br.com.java.aluraJavaUtil.especial;


import br.com.java.aluraJavaUtil.modelo.Conta;

public class ContaEspecial extends Conta {

	public ContaEspecial(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor; 

	}

}
