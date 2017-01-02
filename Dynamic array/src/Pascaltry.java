import java.util.Scanner;

public class Pascaltry {
	// A O(n^2) time and O(1) extra space function for Pascal's Triangle
	void printPascal(int n,int row,int col)
	{
	  for (int line = 1; line <= n; line++)
	  {
	    int C = 1;  // used to represent C(line, i)
	    for (int i = 1; i <= line; i++)  
	    {
	    	System.out.print(C +" ");  // The first value in a line is always 1
	      C = C * (line - i) / i;  
	    }
	    System.out.println("\n");
	  }
	}
	public static void main(String [] args){
		Pascaltry  pt = new Pascaltry();
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		while(T!=0){
		 int row = in.nextInt();
		 int col = in.nextInt();
		
		pt.printPascal(row,row,col);
		T--;
		}
		//O(1) extra space and O(n2) complexity
	}
	
}
