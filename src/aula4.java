class aula4 {
	//Trabalho Prévio -A
	static int[] naturals( int n) {
		int[]numbers = new int[n];
		int i = 0; 
		while ( i<n){
			numbers  [i]=i+1;
			i++;
		}
		return numbers;
	}
	
	//Trabalho Prévio -B
	static int sum( int[]v){
		int i = 0; 
		int sum =0; 
		while ( i <= v.length) {
			sum += v[i];
			i++;
		}
		return sum;
	}
	 // metodo para textes
	static int evalExB() {
	    int[] v = {3, 2, 8, 6, 42};
	    return sum(v);
	}
	
	
/*
	Calcular o somatório dos valores de um vetor.
	Exemplo:
	sum({1, 3, 5}) → 9

	static int sum(int[] v) { ... }

	Construir um vetor com dígitos aleatórios (números de 0 a 9), dado o comprimento.
	Exemplo:
	randomDigits(5) → {8, 2, 9, 1, 2}
	
	*/
}