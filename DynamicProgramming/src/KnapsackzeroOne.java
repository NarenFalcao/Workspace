import java.util.*;
public class KnapsackzeroOne {
	
	void knapsack(int [] val,int [] wt,int n,int target){
			
		int table[][] = new int[n+1][target+1];
		
		for(int i=0;i<=n;i++)
			for(int w=0;w<=target;w++){
				if(i==0||w==0)
					table[i][w]=0;
				else if(w<wt[i-1]){
					table[i][w] = table[i-1][w];
					
				}
				else{
					table[i][w] = Math.max(val[i-1]+table[i-1][w-wt[i-1]], table[i-1][w]);
				}
				
			}
		
		for(int i=0;i<=n;i++){
			for(int w=0;w<=target;w++){
				System.out.print(table[i][w] +" ");
			}
		System.out.println();
		}
		
	}
	
	
 public static void main(String [] args){
	 KnapsackzeroOne ob = new KnapsackzeroOne();
	 
	 int [] val = new int[] {1,4,5,7};
	 int wt[] = new int[] {1,3,4,5};
	 int target = 7;
	 int n = val.length;
	 ob.knapsack(val,wt,n,target);
	 
	 
	 
 }
}
