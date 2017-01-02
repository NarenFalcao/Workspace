import java.util.*;
public class Mandragoraforest {
	
	int parent(int i){
		return i/2;
	}
	
	int util(int rval,int cval,int []arr){
		int max=Integer.MIN_VALUE;
		int [][] table = new int[rval][cval];
		int [][] strength = new int[rval][cval];
		
		for(int i=0;i<rval;i++)
			for(int j=0;j<cval;j++)
				strength[i][j] = 1;
		
		for(int i=0;i<rval;i++){
			int last = (int) Math.pow(2, i+1);
		
			for(int j=0;j<last;j++)
			{
				if(j%2==0){//eat
				table[i][j] = table[parent(i)][parent(j)];
				strength[i][j] = strength[parent(i)][parent(j)] +1; //bite
				}
				else //defeat
				{
					if(i!=0)
					strength[i][j]= strength[parent(i)][parent(j)];
					table[i][j] = table[parent(i)][parent(j)] + ( arr[i]*strength[i][j]);
					if(table[i][j]>max)
					{
						max = table[i][j];
					}
					
				}
				
			}
		
		}
		
	/*	for(int i=0;i<rval;i++){
			int last = (int) Math.pow(2, i+1);
		
			for(int j=0;j<last;j++)
			{
				System.out.print(table[i][j] +" ");
			}
			System.out.println();
			
		}*/
			
		
		
		
		return max;
	}

	public static void main(String args []){
		Mandragoraforest oo = new Mandragoraforest();
		int [] arr = new int[] {1188729 ,1052940, 9159214, 1041177, 1109408, 1127712 ,708150, 1358977, 769261, 990618 ,8711306, 656084, 156949, 1188775, 9153873, 9345902};
		Arrays.sort(arr);
		int rval = arr.length;
		int cval = (int)Math.pow(2, arr.length);
		int ans = oo.util(rval,cval,arr);
		System.out.println(ans);
		
	}
}
