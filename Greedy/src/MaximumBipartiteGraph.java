import java.util.*;
import java.lang.*;

public class MaximumBipartiteGraph {
	
	public static final int M = 6;
	public static final int N = 6;
	
	boolean MBPutil(boolean graph[][],int u,boolean seen[],int matchR[]){
		//for every job
		for(int v=0;v<N;v++){
		//if user is interested in the job && user hasn't seen the job befpre
			if(graph[u][v] && !seen[v]){ //seen false uh iruntha ullae po
				seen[v] = true;
				//if the job is not occupied || if occupied, and previous occupant can find some other job
				if(matchR[v]<0 || MBPutil(graph,matchR[v],seen,matchR)) //matchR[v] holds the previous occupant
				{
					matchR[v] = u;
					return true;
					
				}
			}
		}
		return false;
	}
	
	
	
	int MBP(boolean graph[][]){
		int result=0;
		//job holder array, index - job , value - applicant
		//M - applicant, N - jobs
		int matchR[] = new int[N];
		for(int i=0;i<N;i++)
			matchR[i] = -1; //initially all jobs are assigned to none
		
		//for every applicant
		for(int u=0;u<M;u++){
			boolean seen[] = new boolean[N]; //job array , which tells if the applicant already checked these jobs or not
			
			if(MBPutil(graph,u,seen,matchR)){
				result++;
				
			}
		}
		return result;
	}
	
	
	 public static void main (String[] args) throws java.lang.Exception
	    {
	        // Let us create a bpGraph shown in the above example
	        boolean bpGraph[][] = new boolean[][]{
	            {false, true, true, false, false, false},
	            {true, false, false, true, false, false},
	            {false, false, true, false, false, false},
	            {false, false, true, true, false, false},
	            {false, false, false, false, false, false},
	            {false, false, false, false, false, true}
	        };
	        
	        MaximumBipartiteGraph o = new MaximumBipartiteGraph();
	        int ans = o.MBP(bpGraph);
	        System.out.println(ans);
	        
	    }

}
