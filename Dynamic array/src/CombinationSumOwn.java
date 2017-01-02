import java.io.*;
import java.util.*;
public class CombinationSumOwn {

	void CombinationSum(int [] arr, int target){
	//	ArrayList<ArrayList<Integer>> ret  = new ArrayList<ArrayList<Integer>> ();
		ArrayList<Integer> list = new ArrayList<Integer>();
		Arrays.sort(arr);
		Combinationutil(arr,target,0,0,list);
	}
	void Combinationutil(int [] input,int target,int sum,int start, ArrayList<Integer> list){
		int i;
		if(sum>target)
			return;
		for(i=start;i<input.length;i++){
			list.add(input[i]);
			sum+=input[i];
			if(sum == target){
				System.out.println(list);
				
			}
			if(sum<target){
				Combinationutil(input,target,sum,i,list);
				
				
			}
			if(sum > target){
				Combinationutil(input,target,sum,i+1,list);
				
			}
			
			
			sum-=list.get(list.size()-1);
			list.remove(list.size()-1);
			
			
			
		}
		
		
	}
	
	public static void main(String [] args){
		
		CombinationSumOwn cs = new CombinationSumOwn();
		
		Scanner in = new Scanner(System.in);
		int [] ar = {5,1,2,3,4,5};
    	int target = 6;
		
		
		cs.CombinationSum(ar,target);
		
		
	}
}
