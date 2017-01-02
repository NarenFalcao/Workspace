import java.util.*;
import java.lang.*;

public class NoOfIslandDFS {

	public static final int R = 5;
	public static final int C = 5;
	
	boolean issafe(int graph[][],int i,int j,boolean visited[][]){
		
		return ((i>=0) && (i<R) && (j>=0) && (j<C) && (graph[i][j]==1) && !visited[i][j]);
		
	}
	
	void dfsutil(int graph[][],int i,int j,boolean visited[][]){
		int row[] = new int[] {-1,-1, -1, 0, 0, 1, 1, 1};
		int col[] = new int[] {-1 ,0, 1, -1, 1, -1, 0, 1};
		visited[i][j] = true;
		
		for(int k=0;k<8;k++){
			if(issafe(graph,i+row[k],j+col[k],visited)){
				dfsutil(graph,i+row[k],j+col[k],visited);
			}
			
			
		}
		
	}
	
	
	
	int dfs(int graph[][]){
		int count=0;
		
		boolean visited[][] = new boolean[R][C];
		
		for(int i=0;i<R;i++)
			for(int j=0;j<C;j++){
				if(!visited[i][j] && graph[i][j]==1){
						dfsutil(graph,i,j,visited);
				count++;
				}
			}
		
		
		return count;
	}
	
	
	public static void main(String args[]){
		
		int graph[][] = new int[][]{{1,0,1,1,0},
									{1,1,0,0,1},
									{1,1,0,1,1},
									{0,0,0,1,0},
									{0,1,0,1,1}
								};
		
		
						/*		 int graph[][]=  new int[][] {{1, 1, 0, 0, 0},
						             {0, 1, 0, 0, 1},
						             {1, 0, 0, 1, 1},
						             {0, 0, 0, 0, 0},
						             {1, 0, 1, 0, 1}
						            };*/

								
		
		NoOfIslandDFS o = new NoOfIslandDFS();
	int ans = 	o.dfs(graph);
		System.out.println(ans);
		
	}
}
