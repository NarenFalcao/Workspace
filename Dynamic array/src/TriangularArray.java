import java.io.*;
import java.util.*;


public class TriangularArray {
	
	Node head; // head of list

	/* Linked list Node*/
	class Node
	{
		int data;
		Node next;
		Node(int d) {data = d; next = null; }
	}
	
	/* function to insert a new_node in a list. */
	void sortedInsert(Node new_node,int T)
	{
		Node current;

		/* Special case for head node */
		if (head == null || head.data >= new_node.data &&T!=0)
		{
			new_node.next = head;
			head = new_node;
			T--;
		//	System.out.println(new_node.data);
		}
		else {

			/* Locate the node before point of insertion. */
			current = head;

			while (current.next != null &&
				current.next.data < new_node.data &&T!=0)
			{current = current.next;T--;}

			new_node.next = current.next;
			current.next = new_node;
		}
	}

				/*Utility functions*/

	/* Function to create a node */
	Node newNode(int data)
	{
	Node x = new Node(data);
	return x;
	}

	/* Function to print linked list */
	void printList(int T)
	{
		Node temp = head;
		while (temp != null && T!=0)
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
			T--;
		}
	}
	
	
	
	
	void matsum(int[][] multi,int a,int b,int []arr,int T){
		
		if(a<6 && b<6 && b<=a){
		
		 //Addition of all Diagonal Elements
		System.out.println("recurse");
		System.out.println(+a);
		System.out.println(+b);
		  int  sum = 0;
		   int k=0,iter=0;
		  for(int i=a;i<6;i++)
		  {
			/*  if(a==b){
			  for(int j=b;j<=i;j++){
				  System.out.println(multi[i][j]);
				  sum+=multi[i][j];
			  }
			  }
			  else{*/
			  if(k==0){
				  arr[iter] = multi[a][b];
				  //System.out.println("\n First" +arr[iter]);
				  iter++;
				 
			  }
			  
		/*	  else if(arr[iter-1]==0){
				  for(int j=b;j<=b+k && k<(6-a);j++){
					//  System.out.println(multi[i][j]);
					  sum+=multi[i][j];
				  }
				  arr[iter] = sum; 
				iter++;
			  }*/
			  else{
				  int suminner=0;
				  int prevsum = arr[iter-1];
				  //System.out.println("\nprevsum" +prevsum);
				  for(int j=b;j<=b+k && k<(6-a);j++){
						 //System.out.println("Val" +multi[i][j]);
						  suminner+=multi[i][j];
					  }
				  //System.out.println("\n" +(sum+prevsum));
				 // System.out.println("\nloopsum" +suminner);
					sum = suminner+prevsum;
				//	System.out.println("\nFinalsum" +sum);
				  arr[iter] = sum; 
					iter++;
				 
			  }
			  
			  Node new_node;
				new_node = newNode(arr[iter-1]);
				sortedInsert(new_node,T);
				//System.out.println(arr[iter-1]);
				
			  k++;
		  }
		}
		  
		  if(a<6 && b<=a && b<6){
			//  matsum(multi,a+1,b,arr);
			  matsum(multi,a,b+1,arr,T);
			 }
		  
		  //for(int i=0;i<6;i++)
		//	  System.out.print(arr[i]);
		  
	}
	

	
	
	public static void main(String [] args){
		
		TriangularArray ta = new TriangularArray();
		int sum=0;
		int [] arr = new int[6];
		int [] sorted = new int[6*6];
		
		
		Scanner in = new Scanner(System.in);
		//int N = in.nextInt();
		int T = in.nextInt();
		
		 
		int[][] multi = new int[][]{
			  { 15, 0, 0, 0, 0, 0},
			  { -14, -7, 0, 0, 0, 0},
			  { 20, -13, -5, 0, 0, 0},
			  { -3, 8, 23, -26, 0, 0},
			  { 1, -4, -5, -18, 5, 0},
			  { -16, 31, 2, 9, 28, 3}
			};
		
		/*//input
		int[][] multi = new int[N][N];
		for(int i=0;i<6;i++){
			for(int j=0;j<6;j++){
				multi[i][j] = in.nextInt();
			}
			}
	*/
		
		
		
		
		//	for(int i=0;i<6;i++){
				for(int j=0;j<6;j++){
			ta.matsum(multi,j,0,arr,T);
				}
			
			//System.out.println("\n");
			//}
				//System.out.println("\n");
				//System.out.println("\n");
			//}
			
		/*	for(int k=0;k<36;k++)
				System.out.println("\t" + sorted[k]);	
			*/
			
			ta.printList(T);
			
}
	
}