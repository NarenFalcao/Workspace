import java.util.Arrays;

public class prob1 {
	public static void main(String [] args){
		
		prob1 pb = new prob1();
		String a = "abce";
		String b = "abcde";
		System.out.println(pb.findTheDifference(a, b));
		
		
		
	}
	
	   public char findTheDifference(String s, String t) {
	        
	        
		   char[] ar = s.toCharArray();
		   Arrays.sort(ar);

		   char[] ar1 = t.toCharArray();
		   Arrays.sort(ar1);
		   int i=0;
		   int j=0;

		   int size1 = ar.length;
		   int size2= ar1.length;
		   int size;
		   
		   if(size1>size2)
			   size = size1;
		   else
			   size = size2;

		   while(true){
			   if(i>size1-1)
		    	   return ar1[j];
			   else if(ar[i]!=ar1[j]){
		         return ar1[j];
		           
		       }
		       
		       i++;
		       j++;
		    
		    
		   }



		           
		       }
	
}
