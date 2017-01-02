import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.io.*;
import java.util.*;
public class sparsearrays {

	public static void main(String [] args){
		
		try{
			int count = 0;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 String s[] = br.readLine().split(" ");
			 int N= Integer.valueOf(s[0]);
			 System.out.println(N);
			 String [] arr = new String[N];
			 for(int i=0;i<N;i++){
				 	arr[i] =  br.readLine();
				
			 }
			 String Qval[] = br.readLine().split(" ");
			 int Q= Integer.valueOf(Qval[0]);
			 
			 String [] query = new String[Q];
			 for(int i=0;i<Q;i++){
				 	query[i] =  br.readLine();
				
			 }
			 for(int i=0;i<Q;i++){
			 for(int j=0;j<N;j++){
				// System.out.println(query[j]);
			 if(query[i].equals(arr[j]))
{
count++;	
}
			 }
			 System.out.println(count);
			 count = 0;
			 }
			 
		/*	 for(int i=0;i<N;i++){
				 System.out.println(arr[i]);
			 }
			 for(int i=0;i<Q;i++){
				 System.out.println(query[i]);
			 }*/
			 
		}
		catch(Exception e){}
	}
}
