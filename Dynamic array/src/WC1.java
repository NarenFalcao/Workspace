import java.io.*;
import java.lang.*;
import java.util.*;

public class WC1 {
	
	public static void main(String [] args){
		int sum=0;
		int difference;
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int index = in.nextInt();
		int [] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = in.nextInt();
			sum+=arr[i];
		}
		int orig = in.nextInt();
		sum=(sum-arr[index])/2;
		difference = Math.abs(orig-sum);
		if(difference == 0)
			System.out.println("Bon Appetit");
		else
		System.out.println(difference);
		
		
			
		
		
		
	}

}
