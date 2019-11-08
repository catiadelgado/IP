class aula2 {
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
		static int fibonacci ( int n){
			if ( n==0) return 0;
			if ( n==1) return 1 ; 
			int n1=0; 
			int n2=1;
			int i=2; 
			int aux = 0; 
			while (i<=n){
				aux= n1+n2;
				n1 = n2; 
				n2= aux; 
				i++;
			}
			return aux; 
		
		}
			
		
		static int fibonacciRecursivo ( int n){
			if ( n==0) return 0; 
			if ( n==1) return 1; 
			return fibonacci ( n-2) + fibonacci( n-1);
		}
		
		//Exercícios extra - A
		static int gcd(int m, int n) {
			int dividendo =0;
			int divisor=0; 
			if (m>n) {
			dividendo =m;
			 divisor=n; }
			else {
				 dividendo =n;
				 divisor=m;}
			int resto = 0;
			while ( dividendo>divisor) {
				resto = dividendo%divisor;
				
			if ( resto==0) return divisor; 
			else {
				dividendo = divisor; 
				divisor = resto; 
			}
			}
			return divisor;
		}
		
}
	
