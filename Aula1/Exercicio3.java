class Exercicio3 {
	public static void main(String[] args) {
		for(int x = 1; x <= 1000; x++) {
			int y = x % 3;
			if(y == 0){
				System.out.println(x);
			}
			continue;
		}
	}
}
