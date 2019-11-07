class Funtions {

	//1
	public static int  square	( int n)  {
		return n*n; 
	}



	// Exercicio A
	public static int doubleNumber ( int n) {
		return n*2;
	}


	// Exercicio B
	public static double difference ( double n1, double n2){
		return n1-n2; 
	}

	// Exercicio C
	public static double percentage(int n, int total) {
		return (100* (double) n) / (total); 
	}

	// Exercicio D
	public static double average ( int n1, int n2) {
		return (n1+n2)/2;
	}


	// Exercicio E
	public static int round (double  n) {
		/* 
		 * if ( n%1<0.5)  return (int)n; 
			else return (int)n+1;
		 */
		return (int)Math.round(n);
	}

	// Exercicio F
	public static boolean isNegative (int  n) {
		return n<0;
	}	


	// Exercicio G
	public static boolean isOdd (int  n) {
		return n%2!=0;
	}	

	// Exercicio H
	public static boolean isEven (int  n) {
		return n%2==0;
	}	

	// Exercicio I
	public static boolean isMultiple (int  n1, int n2) {
		return n1%n2==0;
	}	

	// Exercicio J
	public static boolean isDigite (int  n) {
		return n>=0 && n<=9;
	}	


	// Exercicio K
	public static boolean isIncluded (int  n, int min, int max) {
		return n>=min && n<=max;
	}	

	// Exercicio L
	public static boolean isExcluded (int  n, int min, int max) {
		return !isIncluded( n, min, max);
		//return !(n>=min && n<=max);
		//return n<min || n>max;	
	}	
		
	
	// Exercicio M
		public static boolean xor (boolean b1, boolean b2) {
			return b1!=b2;
		}
		
		// Exercicio N
		public static boolean isVowel (char l) {
			return ( l=='a'|| l=='e' || l=='i' || l=='o'|| l== 'u');
		}
	/* 
	 * 







N-Saber se um carácter (char) corresponde a uma vogal minúscula.
Exemplos:

isVowel('a') → true
isVower('z') → false
	 */
}