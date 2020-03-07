class TesteConta {
	public static void main(String[] args){
		Conta c1 = new Conta();

		c1.titular = "Ligia";
		c1.numero = 123;
		c1.agencia = "4568-7";
		c1.saldo = 100.0;
		c1.dataAbertura = "07/03/2020";	
		c1.deposita(100.0);
		
		System.out.println("Saldo atual: " + c1.saldo);
		System.out.println("Rendimento mensal: " + c1.calculaRendimento());
	}
}
