
public class MaximumSubarrray {

	
	int max(int a,int b){
		
		if(a>b)
			return a;
		else
			return b;
		
	}
	int maxSubArraySumNONContiguous(int [] a,int size){
		
		int max=a[0];
		for(int i=1;i<size;i++){
			max = max(max,max+a[i]);
		}
		return max;
	}
	
	
	int maxSubArraySumContiguous(int [] a,int size){
		int max_so_far =a[0];
		int max_ending_here=a[0];
		for(int i=1;i<size;i++){ 
		max_ending_here = max_ending_here+a[i];
		
		if(max_ending_here < 0)
			max_ending_here = 0;
		else if(max_ending_here>max_so_far)
			max_so_far = max_ending_here;
		
		
		}
		return max_so_far;
	}
	
	 public static void main(String args[])
	    {
		 
		 MaximumSubarrray ma = new MaximumSubarrray();
	        int [] a = {2 ,-1 ,2, 3, 4, -5};
	        int n = a.length;
	     int ans  = ma.maxSubArraySumContiguous(a,n);
	     int ans1  = ma.maxSubArraySumNONContiguous(a,n);
	     System.out.println(ans +" " +ans1);
	     //  MaximumSubarrcontiguous(arr,0,n-1);
	      // MaximumSubarrnonContiguous(arr);
	 
	    }
	 
	 
}
