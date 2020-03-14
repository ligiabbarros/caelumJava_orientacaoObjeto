package br.com.caelum.contas.modelo;

public class TestaGerente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente gerente = new Gerente();
		
		gerente.setSalario(5000.00);
		
		gerente.setNome("João da Silva");
		
		gerente.setSenha(4321);
		
		System.out.println(gerente.getBonificacao());

	}

}
