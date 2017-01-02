import java.util.*;

class Node
{
	int data;
	Node left,right;
	
	public Node(int da){
		data = da;
		left = right = null;
	}
}


public class Swapnodes {
Node root;


void treeinsertion(int A,int B,Node root){
	
	if(A!=-1){
		root.left = new Node(A);
	}
	if(B!=-1)
		root.right = new Node(B);
	
}

public static void main(String args[]){
	
	Swapnodes tree = new Swapnodes();
	Scanner in = new Scanner(System.in);
	int N = in.nextInt();
	tree.root = new Node(1);
	
	for(int i=0;i<N;i++){
		int A = in.nextInt();
		int B = in.nextInt();
		
		tree.treeinsertion(A,B,tree.root);
		
	
		
		
	}
	
	
	
	
}

}
