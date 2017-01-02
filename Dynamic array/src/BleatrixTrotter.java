import java.io.*;
import java.util.*;

public class BleatrixTrotter {
	
	public void splitdigitsandhash(int n,int arr[]){
		while(n!=0){
			int digit = n%10;
			arr[digit] = 1;
			n = n/10;
		}
		
		
	}
	public boolean checkhash(int [] arr){
		
	
	for(int i=0;i<10;i++){
		if(arr[i] != 1){
			return false;
		}
	}
	return true;
	}
	public static void main(String [] args){
		BleatrixTrotter BT = new BleatrixTrotter();
		int T,i;
		
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//String   = br.readLine().split(" ");
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		int testcase = T;
		if(T<1 || T>100) return;
		while(T>0){
			int [] arr = new int[10];
			boolean check = false;
			i=1;
			int val = sc.nextInt();
			if(val == 0)
				System.out.println("Case:" + (testcase-T+1) +" INSOMNIA");
			else{
			while(true){
				int iN = i*val;
				//System.out.println(iN);
				BT.splitdigitsandhash(iN,arr);
				check=BT.checkhash(arr);
				if(check){
					System.out.println("Case:" + (testcase-T+1) + " " +iN);
					break;
				}
				i++;
			
			}}
			T--;
		}
	}

}
