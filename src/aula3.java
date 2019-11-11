
public class aula3 {
	public static int factorial( int n){
		if ( n==1) return 1;
		return n*factorial(n-1);
	}
	
	// nao percebi bem como este algoritmo funciona
	static int gcd ( int a , int b ){
		if ( b==0) return a; 
		else 
			return gcd( b,a%b);
		
			
			
	}
	

}
