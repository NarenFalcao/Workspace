import java.util.*;

public class mColoringProblem {
	public static final int V=4;
	int color[];
	
	boolean issafe(int graph[][],int c,int color[],int v){
		
		for(int i=0;i<V;i++){
			if(graph[v][i]==1 && c==color[i])
				return false;
		}
		
		return true;
	}
	
	boolean mcprobutil(int graph[][],int m,int color[],int v){
		
		if(v==V)
			return true;
		// check for this vertex about possibility of all colors
		for(int c=1;c<=m;c++){
			if(issafe(graph,c,color,v)){
				
				color[v] = c;
				
				if(mcprobutil(graph,m,color,v+1)){
					return true;
				}
				
				//incase if the adjacent vertex can't have any color, it'll return false  and executes the following code
				
				color[v]=0;
				
				
				
			}
			
		}
		
		
		return false;
	}
	
	
	
	boolean mcprob(int graph[][],int m){
		color = new int[V];
		//starting from vertex 0
		if(!mcprobutil(graph,m,color,0)){
			
			System.out.println("NO SOLUTION");
			return false;
		}
		
		
		
		printsolution(color);
		return true;
	}
	
	void printsolution(int color[]){
		
		for(int i=0;i<V;i++)
			System.out.println(i +" " +color[i]);
	}

	public static void main(String args[]){
		mColoringProblem o = new mColoringProblem();
		
		int graph[][] = new int[][] {{0, 1, 1, 1},
            {1, 0, 1, 0},
            {1, 1, 0, 1},
            {1, 0, 1, 0},
        };
        int m=3;
        o.mcprob(graph,m);
		
		
	}
	
}
