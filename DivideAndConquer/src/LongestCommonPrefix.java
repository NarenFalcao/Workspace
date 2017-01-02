import java.util.*;

public class LongestCommonPrefix {
	
	int minstr(String [] str,int n){
		int min=Integer.MAX_VALUE;
		for(int i=0;i<n;i++){
			if(str[i].length()<min)
				min = str[i].length();
			
		}
		return min;
		
	}
	
	boolean matchesallleft(String []str, String comparison,int n,int low,int high){
		for(int i=0;i<n;i++){

			for(int j=low;j<=high;j++){
				if(str[i].charAt(j)!=comparison.charAt(j))
					return false;
				
			}
				
			
		}
		return true;
	}
	
	String lcp(String [] str, int n){
		
		int index = minstr(str,n); //find the min string count
		//System.out.println(index);
		String prefix="";
		
		int low = 0, high = index;
		
		while(low<high){
			int mid = low + (high-low)/2;
			//System.out.println("MID:" +mid);
			boolean val  = matchesallleft(str,str[0],n,low,mid);
			//System.out.println(val);
			if(val){
				prefix = prefix+str[0].substring(low, mid-low+1);
				low = mid+1;
				
			}
			else
				high = mid-1;
			
		}
		
		return prefix;
	}
	
	
	public static void main(String args[]){
		LongestCommonPrefix o = new LongestCommonPrefix();
		String [] val = new String [] {"geeksforgeeks","geeks","geek","geezer"};
		int n = val.length;
		String ans = o.lcp(val,n);
		
		System.out.println(ans);
	}

}
