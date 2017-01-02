import java.io.*;
import java.util.*;
import java.lang.*;


public class FlippingMatrix {

	
	int matsum(int mat[][],int N,int i,int j){
		int max=mat[i][j];
		
		if(mat[i][N-j]>max)
			max = mat[i][N-j];
		 if(mat[N-i][j]>max)
			max = mat[N-i][j];
		 if(mat[N-i][N-j]>max)
			max = mat[N-i][N-j];
		
		
		return max;
		
		
	}
	
	public static void main(String [] args){
	
		FlippingMatrix fm = new FlippingMatrix();
		int T;
		
		Scanner in = new Scanner(System.in);
		T = in.nextInt();
		while(T!=0){
			int sum=0;
			int N =  in.nextInt();
			//int [][] mat = new int[N][N];
			int [][]mat =  new int[][]{
				  { 112, 42, 83, 119},
				  {56, 125, 56, 49},
				  { 15, 78, 101, 43},
				  { 62, 98, 114, 108}
				};
				for(int i=0;i<N;i++)
					for(int j=0;j<N;j++){
						int val = fm.matsum(mat,(N*N)-1,i,j);
						System.out.println(val);
						sum+=val;
						
					}		
				
		/*	for(int i=0;i<N*N;i++)
				for(int j=0;j<N*N;j++){
					mat[i][j] = in.nextInt();
					
					
				}*/
			

				System.out.println(sum);
			
			T--;
		}
		
	}
}
