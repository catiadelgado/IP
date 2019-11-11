
public class aula3 {
	public static int factorial( int n){
		if ( n==1) return 1;
		return n*factorial(n-1);
	}
	

	static int gcd ( int a , int b ){
		if ( b==0) return a; 
		else 
			return gcd( b,a%b);
	}
	
	//exercicio extra-A
	static int largerDifferenceBetweenPrimes ( int n){
		//TODO fazer o metodo usando o isPrime1
		return 0; 
	}
		/*
		 * Defina uma função que recebe como argumento um número natural n e devolve a maior diferença entre dois números primos consecutivos até n.
Exemplo:

largerDifferenceBetweenPrimes(13) → 4     (a diferença entre 7 e 11)

		 * */	
	
	

}
