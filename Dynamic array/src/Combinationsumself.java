import java.io.*;
import java.util.*;

public class Combinationsumself {
	
	public void csum(int [] candidate,int target){
		
		List<List<Integer>> ret = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
		
		if(candidate.length == 0) return;
		Arrays.sort(candidate);
		
		//for(int i=0;i<4;i++)
		//	System.out.println(candidate[i]);
		
		csumutil(candidate,target,0,0,ret,list);
		System.out.println(ret);
	}
 public void csumutil(int [] candidate,int target,int sum,int start,List<List<Integer>> ret, List<Integer> list)
 {
	 if(sum>target) return;
	 for(int i=start;i<candidate.length;i++){
		 sum+=candidate[i];
		 list.add(candidate[i]);
		 if(sum==target){
			 
			 ret.add(new ArrayList<Integer>(list));
			 sum-=list.get(list.size()-1);
			 list.remove(list.size()-1);
			 return;
			 
		 }
		 if(sum<target){
			 csumutil(candidate,target,sum,i,ret,list);
		 }
		 else{
			 csumutil(candidate,target,sum,i+1,ret,list);
		 }
		 
		 sum-=list.get(list.size()-1);
		 list.remove(list.size()-1);
		 
		 
		 
		 
	 }
	 
 }
	public static void main(String [] args)
	{
		Combinationsumself css = new Combinationsumself();
		int [] arr = {2,6,3,7};
		int target = 7;
		
		css.csum(arr,target);
	}

}
