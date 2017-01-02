import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.*;

public class ModifiedFibonacci {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	BigInteger temp;
        Scanner in = new Scanner(System.in);
            BigInteger t1 = in.nextBigInteger();
            BigInteger t2 = in.nextBigInteger();
            int seq = in.nextInt();
            
            for(int i=0;i<seq-2;i++)
            {
            	temp = t1.add(t2.multiply(t2));
            	t1 = t2;
            	t2 = temp;
            	  System.out.println(t2);
            }
          
           
    }
}