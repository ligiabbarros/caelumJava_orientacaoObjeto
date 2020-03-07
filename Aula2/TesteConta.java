class TesteConta {
	public static void main(String[] args){
		Conta c1 = new Conta();
		int total = Conta.getIdentificador();

		c1.titular = "Ligia";
		c1.numero = 123;
		c1.setAgencia("4568-7");
		c1.setSaldo(100.0);
		c1.dataAbertura = "07/03/2020";	
		c1.deposita(75.0);
		c1.saca(10.0);
		
		System.out.println("Saldo atual: " + c1.getSaldo());
		System.out.println("Rendimento mensal: " + c1.calculaRendimento());
		System.out.println(c1.getAgencia());
		System.out.println(total);
		}
		
	}
