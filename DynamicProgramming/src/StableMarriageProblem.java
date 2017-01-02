import java.io.*;
import java.util.*;


public class StableMarriageProblem {
	public static int N = 4;
	//trying singleton class just to practise
	
	private static StableMarriageProblem object = null;
	
	private StableMarriageProblem (){}
	public static StableMarriageProblem getInstance(){
		object = new StableMarriageProblem();
		return object;
	}
	
	boolean ifm1preferredoverm(int prefer[][],int w,int m,int m1){
		
		for(int i=0;i<N;i++)
		{
			if(prefer[w][i] ==m1)
				return true;
			if(prefer[w][i] == m)
				return false;
		}
		return false;
	}
	
	void stablemarriage(int prefer[][]){
		System.out.println("INSIDE");
		int [] wpair = new int[N]; // array to store the pairs, -1 indicates woman are free
		boolean [] male = new boolean[N]; //assign the male to false
		
		for(int i=0;i<N;i++){
			wpair[i] = -1;
			male[i] = false;
		}
		int freecount  = N;
		
		while(freecount>0){
			System.out.println("INSIDE LOOP");
			int m;
			for(m=0;m<N;m++){
				if(male[m] == false)   // get the first male who is not engaged
					break;
			}
			
			for(int i=0;i<N&&male[m] == false;i++){
				//check if the woman is free
				int w = prefer[m][i];
				if(wpair[w-N] == -1) //the woman is free
				{
					wpair[w-N] = m;
					male[m] = true; //this guy is engaged :P
					freecount--;
					
				}
				else{
					int m1 = wpair[w-N]; //get the previously engaged guy
					if(ifm1preferredoverm(prefer,w,m,m1) == false){
						wpair[w-N] = m;
						male[m] = true;
						male[m1] = false;
						
					}
					
					
					
				}
				
				
			}
			
			
			
			
		}
		
		for(int i=0;i<N;i++)
			System.out.println("\nWOMAN:" +(N+i) +"MAN" +wpair[i]);
		
	}
	
	
	
}
