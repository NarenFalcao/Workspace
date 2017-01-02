import java.util.*;


public class Graph_Moon {
	private Map<Integer,Node> map = new HashMap<>();
	
	
	public class Node{
		int data;
		Node parent;
		int rank;
	}
	
	void makeSet(int data){
		Node node = new Node();
		node.data = data;
		node.parent = node;
		node.rank = 0;
		map.put(data, node);
		
	}
	
public	boolean union(int data1,int data2){
		Node node1 = map.get(data1);
		Node node2  = map.get(data2);
		
		Node parent1 = findSet(node1);
		Node parent2 = findSet(node2);
		
		//already has same parent
		if(parent1.data == parent2.data){
			return false;
		}
		
		if(parent1.rank>=parent2.rank){
			if(parent1.rank==parent2.rank){
				parent1.rank = parent1.rank+1;
				parent2.parent = parent1;
			}
			else
				parent2.parent = parent1;
		}
		else
			parent1.parent = parent2;
		
		return true;
	}

	public int findSet(int data){
		return findSet(map.get(data)).data;
	}
	
	
	
	
	Node findSet(Node node){
		Node parent = node.parent;
		if(parent==node){
			return parent;
		}
		
		node.parent = findSet(node.parent);
		return node.parent;
	}
	
	
	public static void main(String args[]) {
        Graph_Moon ds = new Graph_Moon();
        Scanner in = new Scanner(System.in);
        
        int N = in.nextInt();
        int I = in.nextInt();
        
        for(int i=0;i<N;i++)
        	ds.makeSet(i);

        
        for(int i=0;i<I;i++)
        {
        	int u = in.nextInt();
        	int v = in.nextInt();
        	ds.union(u, v);
        }
        
        //   ds.printmap();
        int arr[] = new int[N];
        int counter = 0;
       Map<Integer,Integer> map1 = new HashMap<>(0);
      
    	  for(int i=0;i<N;i++){
    		  if(map1.get(ds.findSet(i))==null)
    				  map1.put(ds.findSet(i),1);
    		  else		  
    		  map1.put(ds.findSet(i), map1.get(ds.findSet(i))+1);
    		
        }
    	  for (int key : map1.keySet()) {
    		    arr[counter]  = map1.get(key);
    		    counter++;
    		}
    	  Long sum=0l;
    	  for(int i=0;i<counter;i++)
    		  for(int j=i+1;j<counter;j++)
    		  	sum = sum+arr[i]*arr[j];
        
	System.out.println(sum);
	
	}

	
}
