package br.com.caelum.contas.modelo;

public class Gerente extends Funcionario {
	private int senha;
	private int numeroDeFuncionariosGerenciados;
	
	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso Permitido!");
			return true;
		} else {
			System.out.println("Acesso Negado!");
			return false;
		}
	}
	
	//setters e getters

	public void setNome(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setSenha(int i) {
		// TODO Auto-generated method stub
		
	}

	public void setSalario(double d) {
		// TODO Auto-generated method stub
		
	}
	
	public double getBonificacao() {
		return this.salario * 0.15;
	}

}
