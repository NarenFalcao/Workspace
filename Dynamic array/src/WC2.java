import java.io.*;
import java.util.*;
import java.lang.*;

public class WC2 {
	public static void main(String [] args){
		
		int [] orig = new int[5];
		int [] actual = new int[5];
		int count=0;
		Scanner in = new Scanner(System.in);
		for(int i=0;i<5;i++)
		orig[i] = in.nextInt();
		
		for(int i=0;i<5;i++){
		
		actual[i] = in.nextInt();
		int temp = Math.abs(orig[i] - actual[i]);
		if(temp>5){
			 temp = 5-(temp-5);
		}
		count+= temp;
		
		
		
		}
		System.out.println(count);
	}

}
