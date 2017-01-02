import java.util.*;
import java.io.*;

public class Pangrams {

	public static void main(String [] args){
		int count=0;
		int [] arr = new int[26];
		Scanner in = new Scanner(System.in);
		String a = in.nextLine();
		a=a.replace(" ", "");
		a=a.toLowerCase();
		//System.out.println(a);
		for(int i=0;i<a.length();i++){
		int val =  a.charAt(i)-97;
		if(arr[val]!=1)
		arr[val] =1;
		}
		
		for(int i=0;i<26;i++){
			if(arr[i]==1){
				count++;
			}
		}
		
		if(count==26)
			System.out.println("pangram");
		else
			System.out.println("not pangram");
		
	}
}
