import java.io.*;
import java.util.*;

public class NumRevEuler {
	
	boolean reverseoddcheck(long i)
	{
		Long carry=0L;
		Long successcount=0L;
		Long sum;
		int digitcount = String.valueOf(i).length();
		//getting digitwise
		for(int j=1;j<=digitcount;j++){
			
		Long digitpos = Long.parseLong(Long.toString(i).substring(j-1, j)); //from first digit
		Long digitposrev = Long.parseLong(Long.toString(i).substring((digitcount-j), (digitcount-j+1))); //from last digit
		Long lastdigit = Long.parseLong(Long.toString(i).substring((digitcount-1), (digitcount)));//last digit reversible check
		if(lastdigit!=0){
		if(carry==1){
		 sum = digitpos + digitposrev+carry;
		 if(sum%2==0){return false;}
		carry=0L;
		}
		else{
			sum = digitpos + digitposrev;
			if(sum%2==0){return false;}
		}
		
		if(sum>=10){
			sum = sum%10;
			carry = 1L;
		}
		
		if(sum%2!=0){
			successcount++;
		}
		}
		
		if(successcount==digitcount){
			return true;
		}
		}
		return false;
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
		
		NumRevEuler nr = new NumRevEuler();
		
		long val;
		
		Scanner sc = new Scanner(System.in);
		
		long T = sc.nextInt();
		
		while(T!=0){
			long count = 0;
			long c=0;
			val = sc.nextLong();
		
			for(long i=1;i<val;i++){
				int digitcount = String.valueOf(i).length();
				Long digitpos = Long.parseLong(Long.toString(i).substring(0, 1)); //from first digit
				Long digitposrev = Long.parseLong(Long.toString(i).substring(digitcount-1, digitcount)); //from last digit
				if((digitpos+digitposrev)%2!=0){
				if(nr.reverseoddcheck(i)){
					count++;
				}
				}
			}
			
			
			T--;
			System.out.println(count);	
		}
		
		
		
	}
	
}
