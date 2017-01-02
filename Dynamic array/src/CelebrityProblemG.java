import java.io.*;
import java.lang.*;
import java.util.*;


public class CelebrityProblemG {
	
	
	
	int maxindex(int arr[],int n){
		int index=-1;
		
		int max = Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
			if(arr[i]>max){
				max = arr[i];
				index=i;
				
			}
		
	
		return index;
	}
	
	
	public static void main(String [] args){
		CelebrityProblemG g = new CelebrityProblemG();
		int count=0;
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		while(T!=0){
			
			int N = in.nextInt();
			int [] arr = new int[N];
			int [][] mat = new int[N][N];
			for(int i=0;i<N;i++)
				for(int j=0;j<N;j++){
					mat[i][j] = in.nextInt();
					if(mat[i][j] == 1){
						arr[j]++;
					
					}
				}
			
			int maxindex = g.maxindex(arr,N);
			if(arr[maxindex] == N-1){
			System.out.println(maxindex);
			
			}
			else
			{
				System.out.println("Doesnt exist");
			}
			T--;
		}
		
	}

}
