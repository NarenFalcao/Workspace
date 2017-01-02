import java.io.*;
import java.lang.*;
import java.util.*;



public class SubarrayG {
	

	int utilfun(int sum,int arr[],int n,int target,int left,int right){
		
	
			
			if(sum==target){
				System.out.println(left +" " +right);
			return 1;
			}
			else if(sum>target){
				sum-=arr[left];
				utilfun(sum,arr,n,target,left+1,right);
			}
			else if(sum<target){
				sum+=arr[right];
			utilfun(sum,arr,n,target,left,right+1);	
			}
				
				
			
	return 0;
		
	}
	

	public static void main(String [] args){
		SubarrayG g = new SubarrayG();
		int left=1,right=1;
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		while(T!=0){
			int S = in.nextInt();
			int [] arr = new int[S];
			int target = in.nextInt();
			for(int i=0;i<S;i++){
				arr[i] = in.nextInt();
			}
			g.utilfun(0,arr,S,target,0,0);
				}
			T--;
		}
		
	}



