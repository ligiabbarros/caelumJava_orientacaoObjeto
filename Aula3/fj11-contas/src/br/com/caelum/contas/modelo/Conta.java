package br.com.caelum.contas.modelo;

public class Conta {
	public double saldo;
	String titular;
	int numero;
	String agencia;

	void deposita(double valor) {
		this.saldo += valor;

	}

	void saca(double valor) {
		this.saldo -= valor;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

}
