import java.io.*;
import java.util.*;

public class Solutionnew {
	
	public static void main(String [] args){
		Scanner in  = new Scanner(System.in);
		
		String value = in.nextLine();
		if(value.equals("TopUsers")){
			System.out.println("INside");
			int noofMsg = in.nextInt();
			System.out.println(noofMsg);
			String  [] arr = new String[noofMsg+1]; 
			String  [] arr1 = new String[noofMsg+1];
			String  [] arr2 = new String[noofMsg+1];
			String [] input = new String[noofMsg+1];
		
			for(int i=0;i < noofMsg;i++){
				Scanner in1  = new Scanner(System.in);
				//System.1out.println("FOR");
				input[i] = in1.nextLine();
				 
				
			}
			
			for(int i=0;i<noofMsg;i++){
				System.out.println("FORn");
				 		
				
				
				 String[] separated = input[i].split(",");
				 arr1[i] =  separated[0];
				 arr[i] =  separated[1];
				 
			 arr2[i] =  separated[2];
				 
				 
			}
			
			 for(int j=0; j < arr.length - 1;j++)
			 {
			   int  shortestStringIndex = j;

			     for (int i=j+1 ; i<arr.length; i++)
			     {
			         //We keep track of the index to the smallest string
			         if(arr[i].trim().compareTo(arr[shortestStringIndex].trim())<0)
			         {
			             shortestStringIndex = i;  
			         }
			     }
			     //We only swap with the smallest string
			     if(shortestStringIndex != j)
			     {
			         String temp = arr[j];
			         String temp1 = arr1[j];
			         String temp2 = arr2[j];
			         arr[j] = arr[shortestStringIndex]; 
			         arr1[j] = arr1[shortestStringIndex];
			         arr2[j] = arr2[shortestStringIndex];
			         arr[shortestStringIndex] = temp; arr1[shortestStringIndex] = temp1; arr2[shortestStringIndex] = temp2;
			     }
			 }

 
			 
			 
			for(int i=0;i<noofMsg;i++){
				System.out.println(arr1[i] +"\n");
				System.out.println(arr[i] +"\n");
				System.out.println(arr2[i] +"\n");
				
			}
		}
		if(value == "TopHours"){
			int noofMsg = in.nextInt();
			
			
		}
		if(value == "TopWords"){
			int noofMsg = in.nextInt();
			
			
		}
		
	}

}
