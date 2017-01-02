import java.util.*;
//easy algo, go to tushar video if any doubt
public class KruskalGraph {
	int V;
	int E;
	edge edgeobj[];
	
	class edge implements Comparable<edge>{
		int src;
		int destination;
		int weight;
		
		public int compareTo(edge comparator){
			return this.weight-comparator.weight;
		}
		
	}
	class subset{
		int parent;
		int rank;
	}
	

	
	KruskalGraph(int e,int v)
	{
		V = v;
		E= e;
		edgeobj = new edge[E];
		for(int i=0;i<E;i++)
			edgeobj[i] = new edge();
		
	}
	
	//this method is to find parent of i
	public int find(subset nodeval[],int i){
		if(nodeval[i].parent!=i){
			nodeval[i].parent = find(nodeval,nodeval[i].parent);
		}
		return nodeval[i].parent;
	}
	
	
	public void union(subset nodeval[],int x,int y){
		int rootx = find(nodeval,x); //find parent of x
		int rooty = find(nodeval,y); //find parent of y
		if(rootx!=rooty){
			if(nodeval[rootx].rank>nodeval[rooty].rank){
				nodeval[rooty].parent = rootx;
				
			}
			else if (nodeval[rootx].rank<nodeval[rooty].rank){
				nodeval[rootx].parent = rooty;
			}
			else{
				nodeval[rooty].parent = rootx;
				nodeval[rootx].rank++;			//increment the rank and add to parentx
			}
			
		}
	}
	
	
	
	public void kruskal(){
		edge result[] = new edge[V]; //to store the non looping edges, size will the vertex count
		for(int k=0;k<V;k++)
			result[k] = new edge();
		int i=0;
		int e=0;
		subset nodeval[] = new subset[V];
		for(int k=0;k<V;k++)
			nodeval[k] = new subset();
	
		for(int k=0;k<V;k++)
		{
			nodeval[k].rank = 0;
			nodeval[k].parent = k;
		}
		e=0;
		i=0;
		Arrays.sort(edgeobj);

		
		while(e<V-1){
			
			edge new_edge = new edge();
			new_edge = edgeobj[i++];
			
			int x = find(nodeval,new_edge.src); //get the first ones parent
			int y = find(nodeval,new_edge.destination); //get the second ones parent
			
			if(x!=y){
				result[e++] = new_edge;
				union(nodeval,x,y);
				
			}
			//e will give the count of edges
			
			
			
		}
		
		
		for(int k=0;k<e;k++){
			System.out.println("SRC" +result[k].src +"DEST" +result[k].destination +"Weight" +result[k].weight);
		}
		
		
		
		
		
	}
	
	
	public static void main(String args[]){
		
		//this graph
		/*
        10
   0--------1
   |  \     |
  6|   5\   |15
   |      \ |
   2--------3
       4       */
		
		
		
		int E=5;
		int V=4;
		
		KruskalGraph graph = new KruskalGraph(E,V);
		
		
		graph.edgeobj[0].src = 0;
		graph.edgeobj[0].destination = 1;
		graph.edgeobj[0].weight = 10;
		

		graph.edgeobj[1].src = 0;
		graph.edgeobj[1].destination = 2;
		graph.edgeobj[1].weight = 6;
		

		graph.edgeobj[2].src = 2;
		graph.edgeobj[2].destination = 3;
		graph.edgeobj[2].weight = 4;
		

		graph.edgeobj[3].src = 1;
		graph.edgeobj[3].destination = 3;
		graph.edgeobj[3].weight = 15;
		

		graph.edgeobj[4].src = 0;
		graph.edgeobj[4].destination = 3;
		graph.edgeobj[4].weight = 5;
		
		
		
		graph.kruskal();
		
		
		
	}

}
