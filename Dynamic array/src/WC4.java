import java.io.*;
import java.util.*;
import java.lang.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class WC4 {
	
	
	
	
	public static void main(String [] args){
		int T;
		WC4 wc = new WC4();
		
		Scanner in = new Scanner(System.in);
		T = Integer.parseInt(in.nextLine());
		//System.out.println("\n");
		while(T!=0){
			int flag=0;
			int count=0;
			String a = in.nextLine();
		
			String b = in.nextLine();
	
			if(b.length()<a.length()){
			
			for(int i=0;i<=a.length()-1 && flag!=-2;i++){
				for(int j=count;j<=b.length()-1;j++){
				if(Character.isLowerCase(a.charAt(i)))
				if(Character.toUpperCase(a.charAt(i)) == b.charAt(j))
				{count++;flag=1;
				System.out.println("y");
				break;}
				
				else{
					flag=-1;
					System.out.println("n");
				}
				
				else{
					
					if(a.charAt(i) == b.charAt(j))
					{count++;flag=1;
					System.out.println("Y");
					break;}
					else{
						System.out.println("N");
						flag=-2;
					}
					}
				
			
			}
		}
			}
			else
				System.out.println("YES");

			if(flag<0)
				System.out.println("NO");
			else
				System.out.println("YES");
			//System.out.println(count);
		T--;
		
	}

}
}
