import java.io.*;
import java.util.*;
import java.lang.*;


public class WC4new {
	


	public static void main(String [] args){
		int T;
		
	//	int counter = 0;
		WC4new wc = new WC4new();
		Scanner in = new Scanner(System.in);
		T = Integer.parseInt(in.nextLine());
		while(T!=0){
			int k=0;
			int countera=0;
			int counterb=0;
			int val=0;
			String a = in.nextLine();
			String temp ="";
			char[] charA = new char[a.length()];
			String b = in.nextLine();
			char[] charB = a.toCharArray();
			for(int i=0;i<=b.length()-1;i++){
				for(int j=countera;j<=a.length()-1;j++){
					if(Character.isLowerCase(a.charAt(j))){
					if(b.charAt(i) == Character.toUpperCase(a.charAt(j)) ){
						countera++;
						charA[k] = Character.toUpperCase(a.charAt(j));
						k++;
						temp.concat(String.valueOf(charA[k]));
						break;
											}
					else{
					countera++;
						
					}
					
					}
					else{
						countera++;	
						charA[k] = Character.toUpperCase(a.charAt(j));
						temp.concat(String.valueOf(charA[k]));
						k++;
						break;
						}
						
						
						
					}
					
					
					}
			String text = new String(charA).trim();
			System.out.println(text);
			
			if (b.equals(text))
				System.out.println("YES");
			else
				System.out.println("NO");
			T--;
				}
			
	
		}
		
	}
	

