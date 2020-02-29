class Exercicio6{
	public static void main(String[] args){
		
		for(int x = 0; x <= 100; x++) {
			if(x <= 2){
				System.out.println(x);
			} else {
				int resultado = (x -1) + (x - 2);
				System.out.println(resultado);
			}
			
		}	
	}
}
