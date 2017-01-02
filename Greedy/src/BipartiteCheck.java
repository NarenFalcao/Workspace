import java.util.*;
public class BipartiteCheck {
	public static final int V = 4;
	
	boolean isBipartite(int graph[][],int src){
		
		int colorArr[] = new int[V];
		for(int i=0;i<V;i++)
			colorArr[i] = -1;
		
		colorArr[src] = 1;
		LinkedList<Integer> queue = new LinkedList<Integer>();
		queue.add(src);
		
		while(queue.size()!=0){
			
			int u = queue.poll();
			//for all adjacent vertex
			for(int v=0;v<V;v++){
				if(graph[u][v]==1 && colorArr[v]==-1){
					
					colorArr[v] = 1-colorArr[u];
					queue.add(v);
				}
				else if(graph[u][v] == 1 && colorArr[v] == colorArr[u]){
					return false;
				}
				
				
			}
		}
		return true;
	}
	
	
	
	public static void main(String args[])
	{
		BipartiteCheck o = new BipartiteCheck();
		int graph[][] = new int[][] {{0, 1, 0, 1},
            {1, 0, 1, 0},
            {0, 1, 0, 1},
            {1, 0, 1, 0}};
		if(o.isBipartite(graph,0)) //src is zero
			System.out.println("BIPARTITE");
		else
			System.out.println("NOT BIPARTITE");
		
	}
}
