import java.io.*;
import java.util.*;
import java.lang.*;
public class prob2 {
	
	int oddeven=0;
	int method(int arr[],int n){
		//System.out.println("N" +n);
		int ans;
		int j=0;
		int [] a = new int[n];
		if(oddeven%2==0){
		for(int i=0;i<n;i++){
			if(i%2!=0){
		//		System.out.println("UP");
		//	System.out.println(arr[i]);
				a[j] = arr[i];
				j++;
			}
		}
		oddeven++;
		}
		else{
			//System.out.println("Down");
			for(int i=0;i<n;i++){
				if(n%2==0){
				if(i%2==0){
				
				//System.out.println(arr[i]);
					a[j] = arr[i];
					j++;
				}
				}
				else if(n%2!=0)
				{
					if(i%2!=0){
						
					//	System.out.println(arr[i]);
							a[j] = arr[i];
							j++;
						}
					
				}
			}
			
			oddeven++;
			
			
		}
	//	System.out.println("\n");
		if(j==1){
		//	System.out.println("Print" +a[0]);
			return a[0];
			
		}
		else
 return(method(a,n/2));
			
		
			}
	
	
	public static void main(String [] args){
		prob2 pb = new prob2();
		Scanner in = new Scanner(System.in);
		
		
		int n = in.nextInt();
		int k=1;
		
		int [] arr = new int[6];
	//	System.out.println(n);
		for(int i=0;i<n;i++){
			
			arr[i] = k;
			k++;
		//	System.out.println(arr[i]);
		}
		
		int ans = pb.method(arr,n);
		System.out.println(ans);
		
	}

}
