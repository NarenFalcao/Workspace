import java.io.*;
import java.util.*;

public class CoinChange {
	
	int count=0;
	int coincheck(int [] arr,int amount,int si){
		//System.out.println("C"+c);
		
		
		int sum=0;
		int tamount = amount;
	
		//while(sum!=amount){
			tamount-=arr[si-1];
		//	System.out.println(tamount);
			count++;
		//	System.out.println("C" +count);
			if(tamount==0){
				return count;
			}
			else if(tamount<0){
				tamount+=arr[si-1];
			//	System.out.println("inside"+tamount);
				count--;
				coincheck(arr,tamount,si-1);
			}
			else{
				coincheck(arr,tamount,si);
			}
			
	//	}
		return count;
	}

	public static void main(String [] args){
		
		CoinChange cc = new CoinChange();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int [] arr = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = in.nextInt();
		
		int amount = in.nextInt();
		
		int c = cc.coincheck(arr,amount,n);
		System.out.println("Count" +c);
		
		
	}
}
