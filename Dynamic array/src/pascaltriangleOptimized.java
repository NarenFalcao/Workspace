import java.io.*;
import java.util.*;

public class pascaltriangleOptimized {
	void printPascal(int n)
	{
	  for (int line = 1; line <= n; line++)
	  {
	    int C = 1;  // used to represent C(line, i)
	    for (int i = 1; i <= line; i++)  
	    {
	      System.out.print(C +"\t");  // The first value in a line is always 1
	      C = C * (line - i) / i;  
	    }
	    System.out.println("\n"); 
	  }
	}
	
	void pascal(int n){
		int i,line;
		int [][] arr = new int[n][n];
		for(line = 0;line<n;line++){
			for( i=0;i<=line;i++){
				if(i==0|| i==line){
					arr[line][i] = 1;
					
				}
				else{
					arr[line][i] = arr[line-1][i-1] + arr[line-1][i];
					
					
				}
				
			}
			
		}
		
		for(int l=0;l<n;l++){
			for(int j=0;j<=l;j++)
		System.out.print(arr[l][j] +"\t");
		System.out.println("\n");
		}
		
	}

	public static void main(String [] args){
		pascaltriangleOptimized  pt = new pascaltriangleOptimized ();
		
		int n=9;
		pt.printPascal(n);
		
		//O(n2) extra space and O(n2) complexity
	}
}
