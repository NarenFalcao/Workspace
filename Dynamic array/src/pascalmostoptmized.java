import java.io.*;
import java.util.*;
import java.math.*;
public class pascalmostoptmized {
	
	void pascal(BigInteger n,BigInteger row,BigInteger col){
		BigInteger line = BigInteger.ZERO;
		BigInteger i = BigInteger.ZERO;
		BigInteger count= BigInteger.ZERO;
		for(line = BigInteger.ONE;line.compareTo(n) <=0;line = line.add(BigInteger.ONE)){
			BigInteger C=BigInteger.valueOf(1L);
			for(i = BigInteger.ONE;i.compareTo(line)<=0;i = i.add(BigInteger.ONE)){
		//		System.out.print(i +"Ivalue");
				if(!C.mod(new BigInteger("7")).equals(BigInteger.ZERO) && line.compareTo(row) <=0 && i.compareTo(col)<=0){
					count = count.add(BigInteger.ONE);
				System.out.print("0" +"\t");
				}
				//c++;
				else
				System.out.print("1" +"\t");
			
				
				C = C.multiply((line.subtract(i)));
				C = C.divide(i);
				
			}
			
			System.out.println("\n"+line);
		}
		
		System.out.println("\n"+count);
		
	}

	public static void main(String [] args){
		pascalmostoptmized  pt = new pascalmostoptmized();
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		while(T!=0){
		 BigInteger row = in.nextBigInteger();
		 BigInteger col = in.nextBigInteger();
		
		pt.pascal(row,row,col);
		T--;
		}
		//O(1) extra space and O(n2) complexity
	}
}
