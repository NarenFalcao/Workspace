import java.util.*;

public class DisjointSet {
	private Map<Long,Node> map = new HashMap<>();
	
	
	public class Node{
		long data;
		Node parent;
		int rank;
	}
	
	void makeSet(long data){
		Node node = new Node();
		node.data = data;
		node.parent = node;
		node.rank = 0;
		map.put(data, node);
		
	}
	
public	boolean union(long data1,long data2){
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

	public long findSet(long data){
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
        DisjointSet ds = new DisjointSet();
        ds.makeSet(1);
        ds.makeSet(2);
        ds.makeSet(3);
        ds.makeSet(4);
        ds.makeSet(5);
        ds.makeSet(6);
        ds.makeSet(7);
        ds.makeSet(8);
        ds.makeSet(9);
        ds.makeSet(0);

        ds.union(0, 2);
        ds.union(1, 8);
        ds.union(1, 4);
        ds.union(2, 8);
        ds.union(2, 6);
        ds.union(3, 5);
        ds.union(6, 9);

     //   ds.printmap();
        
       System.out.println(ds.findSet(0));
        System.out.println(ds.findSet(1));
        System.out.println(ds.findSet(2));
        System.out.println(ds.findSet(3));
        System.out.println(ds.findSet(4));
        System.out.println(ds.findSet(5));
        System.out.println(ds.findSet(6));
        System.out.println(ds.findSet(7));
        System.out.println(ds.findSet(8));
        System.out.println(ds.findSet(9));
    }

}
