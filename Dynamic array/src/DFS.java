import java.io.*;
import java.util.*;

public class DFS {
	
	private int V;
	
	private LinkedList<Integer> adj[];
	
DFS(int size){
	V = size;
	adj = new LinkedList[size];
	for(int i=0;i<size;i++){
		adj[i] = new LinkedList();
	}
}

void dfsutil(int v,boolean visited[]){
	int n;
	visited[v] = true;
	System.out.println(v + " ");
	
	Iterator<Integer> i = adj[v].listIterator(); // important thing to remember
		while(i.hasNext()){
			n = i.next();
			if(!visited[n]){
				dfsutil(n,visited);
			}
		}
}
	
void dfsfunc(int start){
	boolean visited[] = new boolean[V];
	
	//automatically given to false
	
	dfsutil(start,visited);
	
}
	
void add_edge(int v, int w){
	adj[v].add(w);
	
}	

	
	
	
	

	public static void main(String [] args){
		DFS graph = new DFS(4);
		
		graph.add_edge(0,1);
		graph.add_edge(0,2);
		graph.add_edge(1,2);
		graph.add_edge(2,0);
		graph.add_edge(2,3);
		graph.add_edge(3,3);
		
		graph.dfsfunc(2);
		
		
	}
}
