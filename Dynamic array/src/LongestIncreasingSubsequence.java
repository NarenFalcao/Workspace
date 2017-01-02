import java.io.*;
import java.util.*;

public class LongestIncreasingSubsequence {
	
	static int Ceilindex(int [] a,int l,int r,int key){
		while(r-l>1){
			int m = l+(r-l)/2;
			if(a[m]>=key)
				r=m;
			else
				l=m;
			
		}
		return r;
		
		
		
	}
	static int LIS2(int A[], int size)
	{
		// Add boundary case, when array size is one

		int[] tailTable = new int[size];
		int len; // always points empty slot

		tailTable[0] = A[0];
		len = 1;
		for (int i = 1; i < size; i++)
		{
			if (A[i] < tailTable[0])
				// new smallest value
				tailTable[0] = A[i];

			else if (A[i] > tailTable[len-1])
				// A[i] wants to extend largest subsequence
				tailTable[len++] = A[i];

			else
				// A[i] wants to be current end candidate of an existing
				// subsequence. It will replace ceil value in tailTable
				tailTable[Ceilindex(tailTable, -1, len-1, A[i])] = A[i];
		}
for(int i=0;i<len;i++)
			System.out.print(tailTable[i] +" ");
		return len;
	}
	
	int LIS(int [] a,int size){
		
		int [] tailTable = new int[size];
		
		tailTable[0] = a[0];
		int len = 1;
		
		for(int i=1;i<size;i++){		
			if(a[i]<tailTable[0]){
				tailTable[0] = a[i];
			}
			
		
		else if(a[i]>tailTable[len-1]){
			tailTable[len++] = a[i];
			
		}
		else{
			tailTable[Ceilindex(tailTable, -1, len-1, a[i])] = a[i];
		}
		}
		
		for(int i=0;i<len;i++)
			System.out.print(tailTable[i] +" ");
		return len;
		
	}
	public static void main(String [] args){
		
		LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();
	//	int [] arr = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};
		int [] arr = { 2, 5, 3, 7, 11, 8, 10, 13, 6 };
		int size = arr.length;
		
		int length = lis.LIS(arr,size);
		System.out.println("Length:" +length);
		
		
		
	}

}
