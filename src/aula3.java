
public class aula3 {
	
	// trabalho prévio -A
	public static int numberOfDivisors( int n){
		int count =0; 
		int i =1;
		while ( i <=n){
			if ( n%i==0) count++;
				i++;
		}
		return count;
	}
	
	// trabalho prévio -B
	
	public static int sumOfDivisors( int n){
		int count =0; 
		int i =1;
		while ( i <n){
			if ( n%i==0) count += i;
				i++;
		}
		return count;
	}
	
	// exercicios -A
	public static boolean isPrime( int n){
		int count = numberOfDivisors (n);
		if ( count== 2) return true;
		return false; 
	}
	// exercicios -B
	public static int sumOfPrimesSmallerThan ( int n){
		int sum =0;
		int i =1; 
		while ( i<n) {
			if ( isPrime(i)) sum+=i;
			i++;
		}
		return sum;
		
	}
	
	// exercicios-C
	static int numberOfPrimesUpTo(int n ) {
		int count =0; 
		int i = 1;
		while ( i<=n){
		if ( isPrime(i)) count++;
		i++;
		}
		return count; 
	}
		
	// exercicios -D
	public static boolean isPerfect ( int n ) {
		if ( sumOfDivisors( n ) == n ) return true; 
		return false;
	}
	
	// exercicios -E
	public static int numberofPerfectNumbersUpTo(int n) {
		int count=0;
		int i = 1; 
		while ( i<=n){
			if ( isPerfect(i)) count++;
			i++;
		}
		return count;
	}
	
	//exercicios -F
	
	public static boolean existsPrimeBetween ( int min , int max){
		int i = min+1; 
		while ( i<max) {
			if ( isPrime( i)) return true; 
			i++;
		}
		return false;
	}
	
	// exercicios G-1
	public static int  fibonacci ( int n) {
		if ( n ==0 || n==1 ) return n; 
		else return fibonacci ( n-1) + fibonacci ( n-2);
	}
	
	// exercicios G-2
	public static int factorial( int n){
		if ( n==1) return 1;
		return n*factorial(n-1);
	}
	
	// exercicios G-3
	static int gcd ( int a , int b ){
		if ( b==0) return a; 
		else 
			return gcd( b,a%b);
	}
	
	//exercicio extra-A
	static int largerDifferenceBetweenPrimes ( int n){
		int max=0;
		int count =0;
		boolean flag = false;
		int i = 1; 
		while ( i<n){
			if ( isPrime(i)){
			flag = !flag;
			if (!flag) {
				if ( count> max ) max = count; 
				flag = true;
				count=0;
			}
			}
			if (flag) count ++; 
			i++;
		}
		return max; 
	}
	
	/*
	 * validar se é numero primo -se sim começar a contar, 
	 * caso encontre um numero primo depois de começar a contar para a contagem e valida
	 * se é a maior contagem , coloca o contador a zero e volta a contar

Exercícios extra
Defina uma função que recebe como argumento um número natural n e devolve a maior diferença entre dois números primos consecutivos até n.
Exemplo:

largerDifferenceBetweenPrimes(13) → 4     (a diferença entre 7 e 11)


*/
	
	
	

	
		/*
		 * Defina uma função que recebe como argumento um número natural n e devolve a maior diferença entre dois números primos consecutivos até n.
Exemplo:

largerDifferenceBetweenPrimes(13) → 4     (a diferença entre 7 e 11)

		 * */	
	
	

}
