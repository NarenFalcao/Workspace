import java.math.BigInteger;
import java.util.Scanner;

public class Fibonacci {
	
	
	int fibonacci(int n){
		
		int i=1,j=0,k=0,h=1;
		int t;
		while(n>0){
			if(n%2!=0){
				System.out.println(n);
				System.out.println("ODD");
				t = j*h;
				j  = i*h + j*k + t;
				i = i*k+t;
				
			}
			System.out.println(n);
			System.out.println("General");
			t = h*h;
			h = 2*k*h + t;
			k = k*k + t;
			n = n/2;
			
		}
		
		return j;
	}
	
	public static void main(String [] args){
		Fibonacci  pt = new Fibonacci();
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
	
		System.out.println(pt.fibonacci(n));
		
	}

}
