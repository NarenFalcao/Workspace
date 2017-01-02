import java.io.*;
import java.util.*;
import java.math.*;
public class PascalTriangleHackerrank {

	int rcounter=0;
	int ccounter=0;
	/*int pascalutil(int line,int i){
		
		
	}*/
	int k=1;
	int value=1;
	void printPascal(int n,int row,int col)
	{
		int Qvalue=1;
		int Q = n/49;
		int rem = n%49;
		int qsum = compute(Q,row,col);
		int qrem = computerem(rem,row,col);
		System.out.println(qsum+qrem);
	}

	int computerem(int rem,int row,int col){
		int remdiv;
		int sum=0;
		int coldel=7;
	
		 remdiv = rem/7;
		int remmod = rem%7;
			for(int i=0;i<=remdiv;i++){
				if(i==remdiv)
					coldel=remmod;
			for(int counter=1;counter<=coldel;counter++){
				
				
				sum+=value*counter;
				if(counter>=col){
					sum+=value*col;
				}
				
			}
			
			value = value+k;
			}
		
	return sum;	
	}

	
	int compute(int q,int row,int col){
		int sum=0;
		
		
		System.out.println(q);
		while(q!=0){
			
			for(int i=1;i<=7;i++){
				
			for(int counter=1;counter<=7;counter++){
				
				
				sum+=value*counter;
				if(counter>=col){
					sum+=value*col;
				}
				
			}
			
			value = value+k;
			}
			k++;
			value=k;
			q--;
		}
	return sum;	
	}

	public static void main(String [] args){
		PascalTriangleHackerrank  pt = new PascalTriangleHackerrank();
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		while(T!=0){
		 int row = in.nextInt();
		 int col = in.nextInt();
		
		pt.printPascal(row,row,col);
		T--;
		}
		//O(1) extra space and O(n2) complexity
	}
}
