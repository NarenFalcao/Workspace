import java.io.*;
import java.util.*;

public class numrevtrad {
	
	
long reverse(long num){
	
	

	//StringBuilder sb=new StringBuilder(num+"");
	String temp = new StringBuilder(String.valueOf(num)).reverse().toString();
return(Long.parseLong(temp));
	
}
	boolean digitcheck(long num){
		long digit;
		while(num!=0){
			digit=num%10;
			 num = num/10;
			 if(digit%2==0)
				 return false;
		}
		return true;
	}
	public static void main(String [] args){
		
		numrevtrad nr = new numrevtrad();
		
		long val;
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		while(T!=0){
	//		long count = 0;
			long c=0;
			val = sc.nextLong();
			//long rev = nr.reverse(24);
			//System.out.print(rev);
			
			for(long i=1;i<val;i++){
				int dc1 = String.valueOf(i).length();
				
				long rev = nr.reverse(i);
				int dc2 = String.valueOf(rev).length();
			//	System.out.print(rev);
				if(dc1==dc2){
				long ans = rev+i;
				
				boolean flag = nr.digitcheck(ans);
				if(flag){
					//System.out.println(i +" ---");	
					c++;
				}
				}
				
				
			}
			
			
			T--;
			System.out.println(c);	
		}
		
		
		
	}
	
}
