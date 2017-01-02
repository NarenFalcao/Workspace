import java.util.*;
public class CoinChange {
	
	
	int util(int coins[],int target,int N){
		
		int table[][] = new int[N+1][target+1];
		
		for(int i=0;i<=N;i++)
			table[i][0]=1;
		
		for(int i=1;i<=N;i++){
			for(int j=0;j<=target;j++){
			if(j<coins[i-1])
					table[i][j] = table[i-1][j];
				else
					table[i][j] = table[i][j-coins[i-1]]+table[i-1][j];
				
				
			}
			
		}
		
		for(int i=1;i<=N;i++){
			for(int j=0;j<=target;j++){
		System.out.print(table[i][j] +" ");		
			}
			System.out.println();
		}
		
		return 0;
	}
	
	public static void main(String args[]){
		CoinChange o = new CoinChange();
		int coins[] = new int[] {41 ,34 ,46 ,9 ,37 ,32 ,42 ,21 ,7 ,13, 1 ,24 ,3 ,43 ,2 ,23 ,8 ,45 ,19 ,30 ,29, 18 ,35 ,11};
		int target  = 250;
		int n=24;
		int ans = o.util(coins,target,n);
		
		
	}

}
