class Conta {
	String titular;
	int numero;
	private String agencia;
	private double saldo;
	String dataAbertura;
	private static int identificador;

	//construtores

	public Conta() {
		Conta.identificador = Conta.identificador + 1;

	}

	public Conta(String titular) {

	}

	//getters e setters

	public static int getIdentificador() {
		return Conta.identificador;
	}


	public String getAgencia(){
		return this.agencia;
	}
	
	public void setAgencia(String agencia){
		this.agencia = agencia;
	}

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

	//contas

	void deposita(double valor){
		this.saldo += valor;
	}

	double calculaRendimento(){
		return this.saldo* 0.1;

	}
}

