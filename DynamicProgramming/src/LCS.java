import java.util.Scanner;
import java.util.*;

public class LCS {

	
	int max(int a,int b)
	{
		if(a>b)
			return a;
		else 
			return b;
	}
	
	
	/*private Set<String> alllcs(int[][] dp, String fst, String snd, int i, int j) {
		
		
		//String x = "ABCBDAB";
		//String y = "BDCABA";
	    Set<String> lcss = new HashSet<>();

	    if (i == 0 || j == 0) {
	        lcss.add(" ");
	    } else if (fst.charAt(i - 1) == snd.charAt(j - 1)) {
	        for (String lcs : alllcs(dp, fst, snd, i - 1, j - 1)) {
	            lcss.add(lcs + fst.charAt(i - 1));
	        }
	    } else {
	        if (dp[i - 1][j] >= dp[i][j - 1]) {
	            lcss.addAll(alllcs(dp, fst, snd, i - 1, j));
	        }

	        if (dp[i][j - 1] >= dp[i - 1][j]) {
	            lcss.addAll(alllcs(dp, fst, snd, i, j - 1));
	        }
	    }
	    
	    return lcss;
	}*/
	
	
	public Set<String> printalllcs(int [][] c, String X,String Y,int i,int j){
		Set<String> lcss = new HashSet<>();
		if(i==0||j==0)
			lcss.add("");
		else if(X.charAt(i-1) == Y.charAt(j-1)){
			for(String lcs : printalllcs(c,X,Y,i-1,j-1))
				lcss.add(lcs+X.charAt(i-1));
		
			
		}
		else{
			if(c[i-1][j]>=c[i][j-1]){
				lcss.addAll(printalllcs(c,X,Y,i-1,j));
			}
			if(c[i][j-1]>=c[i-1][j]){
				lcss.addAll(printalllcs(c,X,Y,i,j-1));
			}
			
		}
		return lcss;	
	}
	
	void LCS(String x,String y){
		int count1=0;
		int count2 = 0;
		int m = x.length();
		int n = y.length();
		int [][] c = new int[m+1][n+1];
		
		for(int i=0;i<=m;i++){
			for(int j=0;j<=n;j++){
				if(i==0 || j==0 ){
					c[i][j]=0;
				}
				else if(x.charAt(i-1) == y.charAt(j-1)){
					c[i][j] = c[i-1][j-1] +1;
					//System.out.println("hello" +x.charAt(i-1) +" "+y.charAt(j-1));
					count1++;
					
				}
				else
				{
					c[i][j] = max(c[i-1][j],c[i][j-1]);
					//System.out.println("hello" +x.charAt(i-1) +" "+y.charAt(j-1));
					count2++;
				}
					
				
				
				
			}
			
			
		}
		
		Set<String> ans = printalllcs(c,x,y,m,n);
		System.out.println(ans);
		System.out.println(ans.size());
	//	System.out.println(count1);
	//	System.out.println(count2);
	//	System.out.println(count1-count2);
	
		for(int i=0;i<=m;i++){
			for(int j=0;j<=n;j++){
				System.out.print(c[i][j] +" ");
			}
		System.out.println();
		
		}
		
		int i=m;
		int j=n;
		int index = c[m][n];
		System.out.println(index);
		char [] buff = new char[index+1];
		buff[index] = '\0';
		while(i>0 && j>0){
			
			if(x.charAt(i-1) == y.charAt(j-1)){
			buff[index-1] = x.charAt(i-1);
			i--;
			j--;
			index--;
			
				
			}
			else if(c[i-1][j]>c[i][j-1])
				i--;
			else
				j--;
		}
		
		
		System.out.println(buff);
	
	}
	
	
	public static void main(String [] args){
		
		LCS lc = new LCS();
		
		String x = "ABCBDAB";
		String y = "BDCABA";
		
		
		
		//String x = "pxmfjrmvkehafjpxrehkkqcqbjpcmxymsgnfdzzplkdaewzoteyavwwzcnbtsrxyccjxfmbwsfquqelpicmmvymatfvwpemabhlxpjxuywludjhkfwpyowvnkpupalimnnecvtesblatxnewkywvvohdbgfavjxumqhvkznutjpowuvhmnyvzbykuzmchbnlmuiavdfbcuutaqqgiwhjefmcapfisdtohavoputtnhzecalriymlnfabvtbkhtnpenxkbtubuyskwykpablacspjkanwlnxeuuksccptvtqwomusmvuygfdmbkftbdlwmmxeudbdknqudfcrsaefetouygyejfelfqoqvhfabprdbjcihqrzfdbqcafvoowjskqwzironkxxsqedgbycvhnuskhdkkgfpggahvuznqytlldquvbofbxafrxmnbaignazengaxngdobatpmqfzghlamzuoelwvajlvzbuoxwluxqhsmcj";
		//String y = "ohazmsexovixkuuneqnzdhhsweyjmrevqszglreqzacuzefaszzyzramuctxeusmzmtajezzfnrqmmmcyvrogrhntqwlbfpatgjxlweewaiaqidxrqplxdudscuqhrfjtqvksksnfmfhcodvghtkgzojpzytmdcimjzwaonnwmhmsaacnrblvvzhwbiokgziuvsfersuxiiydcfcvnkpbzljsqrqtgmhywkjxlxsixlxrwsnyypjkoxgtyczbouvojmfoqptnqfkvrynavuywnemedlvbvlafhorcfpqixphfwoybefcsbubegqmhcgyfbetfsyuqbadugfylowmzrifijkzlpawkewixgcfvqxapcyzpegrzrqczfdssgvspnjktlshhjqvvlkcmvwtwclpfwlwwulvfvmnnzldpiotcalpktbklalusufgbkrqgzdbagtqzlzealvq";
		
		lc.LCS(x,y);
		
		
		
		
	}
}
