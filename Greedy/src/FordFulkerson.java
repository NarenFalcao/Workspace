import java.util.*;
public class FordFulkerson {
	public static final int V=6;
	
	boolean bfs(int rgraph[][],int s,int t,int parent[]){
		
		boolean visited[] = new boolean[V];
		LinkedList<Integer> queue = new LinkedList<Integer>();
		visited[s] = true;
		parent[s] = -1;
		queue.add(s);
		
		while(queue.size()!=0){
			int u = queue.poll();
			
			for(int i=0;i<V;i++){
				if(visited[i]!=true && rgraph[u][i]>0){
					visited[i] = true;
					queue.add(i);
					parent[i] = u;
					
				}
				
			}
			
			
			
		}
		
		return (visited[t]==true);
		
		
	}
	
	
	int fordf(int graph[][],int s,int t){
		int max_path = 0;
		
		int rgraph[][] = new int[V][V];
		
		
		for(int i=0;i<V;i++)
			for(int j=0;j<V;j++)
				rgraph[i][j] = graph[i][j];
		
		int parent[] = new int[V];
		
		while(bfs(rgraph,s,t,parent)){
			
			int flow = Integer.MAX_VALUE;
			
			for(int i=t;i!=s;i=parent[i]){
				int u = parent[i];
				flow = Math.min(flow, rgraph[u][i]);
			}
			
			for(int i=t;i!=s;i=parent[i]){
			int u = parent[i];
				rgraph[u][i]-=flow;
				rgraph[i][u]+=flow;
			}
			max_path+=flow;
		}
		
		
		
		
		
		return max_path;
	}
	
	
	
	public static void main(String args[]){
		
		int graph[][] =new int[][] { {0, 16, 13, 0, 0, 0},
            {0, 0, 10, 12, 0, 0},
            {0, 4, 0, 0, 14, 0},
            {0, 0, 9, 0, 0, 20},
            {0, 0, 0, 7, 0, 4},
            {0, 0, 0, 0, 0, 0}
          };
		FordFulkerson o = new FordFulkerson();
		int ans = o.fordf(graph,0,5);
		System.out.println(ans);
		
		
	}

}
