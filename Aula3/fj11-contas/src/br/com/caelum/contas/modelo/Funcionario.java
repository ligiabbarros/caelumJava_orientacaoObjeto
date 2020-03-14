package br.com.caelum.contas.modelo;

public class Funcionario {
	protected String nome;
	protected String cpf;
	protected double salario;
	
	//metodos
	public double getBonificacao() {
		return this.salario * 0.10;
	}
}
