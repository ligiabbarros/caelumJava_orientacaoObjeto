class Conta {
	String titular;
	int numero;
	String agencia;
	private double saldo;
	String dataAbertura;

	public double getSaldo(){
		return this.saldo;	
	}

	public void setSaldo(double saldo){
		this.saldo = saldo;	
	}

	void saca(double valor){
		if(valor <= this.saldo){
			this.saldo -= valor;
		}
		
	}

	void deposita(double valor){
		this.saldo += valor;
	}

	double calculaRendimento(){
		return this.saldo* 0.1;

	}
}

