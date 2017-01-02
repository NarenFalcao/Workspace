import java.util.Scanner;

public class Inputs {
	
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		String q = in.next();
		int a = in.nextInt();
		//String s = in.nextLine(); using this will cause so many errors in spaces
		String s = in.next();
		
		System.out.println(s +" " +q);
		
	}

}
