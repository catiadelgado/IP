class Funtions {

	//--------------------------aula 1---------------------------------------------------//
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


	//------------------------------------Aula2--------------------------------------------//

	//1
	static int  min ( int a, int b ) {
		if ( a<b) return a; 
		else return b;
	}


	// 
	static int produto ( int a, int b){
		int i = a; 
		int total = 0; 
		while ( i!=0 ) {
			total += b; 
			i=i-1;
		}
		return total;
	}

	// Trabalho prévio -A

	static int max ( int a, int b ) {
		if ( a<b) return b;
		else return a; 
	}



	// Trabalho prévio -B

	static boolean IsMultipleOther ( int a, int b) {
		int i = b;
		while ( i<a){
			i += b;
		}
		if ( i == a ) return true ;
		else return false;
	}


	//Exercício A
	static int abs( int n){
		if ( n>=0) return n; 
		else return -n;
	}
	
	//Exercício B
	static int divide( int a, int b ) {
		int aux = a; 
		int result = 0;
		while ( aux >= b) {
			aux -=b; 
			result++; 
		}
		return result;
	}

	//Exercício C
	static int powerOfTwo(int n){
		int i = n; 
		int total = 2;
		while ( i>1){
			total *=2; 
			i-=1;
		}
		return total;
	}


	//Exercício D
	static int sumOfNaturalUpTo(int n){
		int i = 0; 
		int total = 0;
		while ( i <n){
			total += i+1;
			i++; }
		return total; 

	}
	
	//Exercício E
	static int sumOfEvenNumbersBetween(int a, int b){
		int i = a; 
		int total = 0;
		while ( i <= b){
			if ( i%2==0){
				total += i;
			}
			i++;
		}
		return total; 

	}
	
	//Exercício F
	static int firstDigit( int n) {
		int i  = 1000000000;
		int digit = 0;
		do {
			digit = n/i; 
		if (digit !=0) return digit; 
		else 
			i = i/10;}
		while ( i>0);
		return digit; 
	}
	
	
	//Exercício G
	/*static int fibonacci ( int n){
		
	}*/
		
		
	/*





G-Obter o n-ésimo número da sequência de Fibonacci, considerando que o primeiro número da sequência tem número de ordem zero.
Recorde: os primeiros números da sequência de Fibonacci são 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
Exemplo:

fibonacci(7) → 13

Sucessão de Fibonacci

//Exercícios extra
A-Defina uma função que recebe como argumento dois números naturais m e n e que calcula o máximo divisor comum desses dois números, usando o algoritmo de Euclides.
Exemplo:

gcd(25, 30) → 5
	 * 
	 * */
	
	
	
}
