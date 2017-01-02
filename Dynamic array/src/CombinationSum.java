import java.io.*;
import java.util.*;

public class CombinationSum {
    public ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
        // Start typing your Java solution below
    	//for(int i=0;i<4;i++)
    	  //  		System.out.println(candidates[i]);
    		
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(candidates.length == 0) return ret;
        Arrays.sort(candidates);
        
       // for(int i=0;i<4;i++)
      	 //  		System.out.println(candidates[i]);
        
        combinationSumHelper(candidates, target, 0, 0, ret, list);
      
        		System.out.println(ret);
        
        return ret;
    }
    
    public void combinationSumHelper(int[] input, int target, int start, int sum,
                                    ArrayList<ArrayList<Integer>> ret,
                                    ArrayList<Integer> list) {
        if(sum > target) return;// Note: This method cannot finish large set if this line is missing
        for(int i = start; i < input.length; i++) {
            list.add(input[i]);
            sum += input[i];
            if(sum == target) {
                ret.add(new ArrayList<Integer>(list));
                sum -= list.get(list.size() - 1);
                list.remove(list.size() - 1);
                return;
            }

            if(sum < target) {
                combinationSumHelper(input, target, i, sum, ret, list);
            } else {
                combinationSumHelper(input, target, i+1, sum, ret, list);
            }

            sum -= list.get(list.size() - 1);
            list.remove(list.size() - 1);
        }
        
        return;
    }
    
    public static void main(String [] args){
    	
    	CombinationSum cs = new CombinationSum();
    	int [] ar = {3,2,6,7};
    	int target = 7;
    	
   // 	for(int i=0;i<4;i++)
    //		System.out.println(ar[i]);
    cs.combinationSum(ar,target);
    	
    	
    	
    }
}