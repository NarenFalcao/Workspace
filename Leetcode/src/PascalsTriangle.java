import java.util.Scanner;
import java.util.*;

public class PascalsTriangle {
	
	public List<List<Integer>> print(int n)
	{
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		//a.add(1);
		//a.add(2);
		for(int line = 1;line<=n;line++){
			int val=1;
			ArrayList<Integer> a = new ArrayList<Integer>();
			
			for(int i=1;i<=line;i++){
				a.add(val);
				val = val*(line-i)/i;
			}
			result.add(a);
			
		}
		
		
		System.out.println(result);
		
		return result;
	}
	
	
	public static void main(String args[]){
		
		PascalsTriangle o = new PascalsTriangle();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		List ans = o.print(n);
	}

}
