import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class NumReverse {

  boolean reverseoddcheck(long i)
	{
		int carry=0;
		Long successcount=0L;
		int sum;
		int digitcount = String.valueOf(i).length();
		char [] ivalue = (""+i).toCharArray();
		//System.out.println(ivalue);
		
	
		//getting digitwise
		for(int j=1;j<=digitcount;j++){
			int digitpos = Character.getNumericValue(ivalue[j-1]);
			int digitposrev = Character.getNumericValue(ivalue[digitcount-j]);
			int lastdigit = Character.getNumericValue(ivalue[digitcount-1]);
			
			/*System.out.println(digitpos);
			System.out.println(digitposrev);
			System.out.println(lastdigit);
			System.out.println("-------");*/
			/*Long digitpos = 
			Long digitposrev = ivalue[digitcount-j];
			Long lastdigit = ivalue[digitcount-1];
			*/
			
		/*	
		Long digitpos = Long.parseLong(Long.toString(i).substring(j-1, j)); //from first digit
		Long digitposrev = Long.parseLong(Long.toString(i).substring((digitcount-j), (digitcount-j+1))); //from last digit
		Long lastdigit = Long.parseLong(Long.toString(i).substring((digitcount-1), (digitcount)));//last digit reversible check
		*/
		
		if(lastdigit!=0){
		if(carry==1){
		 sum = digitpos + digitposrev+carry;
		 if(sum%2==0){return false;}
		carry=0;
		}
		else{
			sum = digitpos + digitposrev;
			if(sum%2==0){return false;}
		}
		
		if(sum>=10){
			sum = sum%10;
			carry = 1;
		}
		
		if(sum%2!=0){
			successcount++;
		}
		}
		
		if(successcount==digitcount){
			return true;
		}
		}
		
	//	System.out.println("*********");
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
		
		NumReverse nr = new NumReverse();
		
		long val;
		
		Scanner sc = new Scanner(System.in);
		
		long T = sc.nextInt();
		
		while(T!=0){
			long count = 0;
			long c=0;
			val = sc.nextLong();
		
			for(long i=1;i<val;i++){
				if(nr.reverseoddcheck(i)){
					count++;
				}
			}
			
			
			T--;
			System.out.println(count);	
		}
		
		
		
	}

}