import java.io.*;
import java.util.*;


public class Pascaltriangleunoptimized {
	
	void pascal(int n){
		for(int line =0;line<n;line++ ){
			for(int i=0;i<=line;i++){
				
				System.out.println(binomialcoeff(line,i));
			}
		System.out.println("\n");
		}
	}
	
	
	int binomialcoeff(int n,int k){
		int res = 1;
		
		if(k>n-k)
			k=n-k;
		
		for(int i=0;i<k;i++){
			
			res*=(n-i);
			res/=(i+1);
		}
	return res;
	}
	public static void main(String [] args){
		Pascaltriangleunoptimized pa = new Pascaltriangleunoptimized();
		int n=9;
		pa.pascal(n);
		
		
	}

}
