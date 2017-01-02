import java.util.*;

public class OptimalBinarySearchTree {
	
	
	int sum(int [] freq,int i,int j){
		int sum1=0;
		for(int k=i;k<=j;k++)
			sum1+=freq[k];
		
		return sum1;
	}
	
	int optimalbst(int [] val,int [] freq,int n){
		
		int [][] table = new int [n][n];
		for(int i=0;i<n;i++)
			table[i][i] = freq[i]; //assign all the diagonal valeus to freq[i]
		
		
		
		for(int L = 2;L<=n;L++) // chain length, it starts from 2 and goes till n
		{
			for(int i=0;i<n-L+1;i++){ // this is the row
				int j = i+L-1; // this is the column
				
				table[i][j] = Integer.MAX_VALUE;
				for(int r=i;r<=j;r++)  //root traverses from i till j
				{
					int c = ( ((r>i)?table[i][r-1]:0) + ((r<j)?table[r+1][j]:0) +sum(freq,i,j));
					if(c<table[i][j])
						table[i][j] = c;
					
				}
			
			}
			
		}
			
		
		
		
		
		
		
		return table[0][n-1];
	}
	
	public static void main(String args[]){
		
		OptimalBinarySearchTree o = new OptimalBinarySearchTree();
		
		int [] val = new int []{10,12,20};
		int n = val.length;
		int [] freq = new int [] {34,8,50};
		int totalcost = o.optimalbst(val,freq,n);
		System.out.println(totalcost);
				
				
	}

}
