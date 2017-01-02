import java.io.*;
import java.util.*;

class Graph{
	
	private int V;
	private LinkedList<Integer> adj[];
	
	Graph(int v){
		V=v;
		adj = new LinkedList[V];
		for(int i=0;i<V;i++)
		adj[i] = new LinkedList();
		
	}
	
	void addEdge(int v,int w){
		
		adj[v].add(w);
	}
	
	void DFSfindpath(int s,int d){
		int path_index=0;
		int [] path = new int[V];
		boolean [] visited = new boolean[V];
		dfsutil(s,d,path,path_index,visited);
	}
	
	void dfsutil(int s,int d,int path[],int path_index,boolean [] visited){
		path[path_index]=s;
		path_index++;
		visited[s] = true;
		
		if(s==d){
			
			for(int i=0;i<path_index;i++)
				System.out.print(path[i]);
			
			System.out.println();
		}
		else{
			Iterator<Integer> i = adj[s].iterator();
			while(i.hasNext()){
			int a = i.next();
			
			if(!visited[a])
				dfsutil(a,d,path,path_index,visited);
				
			}
			
		}
		
		path_index--;
		visited[s] = false;
		
		
	}
	
	
	
	
}


class PrintAllpath{
	
	
	

public static void main(String [] args){
	int s=2,d=3;
	 Graph g = new Graph(4);
	 
        g.addEdge(2, 0);
        g.addEdge(0, 2);
        g.addEdge(0, 3);
        g.addEdge(2, 1);
        g.addEdge(1, 3);
        g.addEdge(0, 1);
 
        System.out.println("Following is Depth First Traversal");
 
        g.DFSfindpath(2,3);
}}
