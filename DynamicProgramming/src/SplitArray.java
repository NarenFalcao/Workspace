import java.util.*;

public class SplitArray {
	
	boolean chksum(int i,int j,int k,int arr[]){
		int sum1 =0;
		int sum2 =0;
		for(int l=i;l<=k;l++){
			sum1 += arr[l];
		}
		for(int o=k+1;o<=j;o++){
			sum2+=arr[o];
		}
		if(sum1==sum2)
			return true;
		else
			return false;
	}
	
	int util(int arr[],int i,int j,int max){
		if(i==j)
			return 0;
		for(int k=i;k<j;k++){
			boolean flag = chksum(i,j,k,arr);
			if(flag == true){
				
			max = 1+Math.max(util(arr,i,k,max),util(arr,k+1,j,max));
				break;
			}
		}
		return max;
	}
	
	
	public static void main(String args[]){
		SplitArray o = new SplitArray();
		int arr [] = new  int[] {4,1,0,1,1,0,1};
		
		int ans = o.util(arr,0,6,0);
		System.out.println(ans);
	}

}
