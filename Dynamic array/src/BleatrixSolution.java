import java.io.*;
import java.util.*;

public class BleatrixSolution {
	
	public void splitdigitsandhash(int n,int arr[]){
		while(n!=0){
			int digit = n%10;
			arr[digit] = 1;
			n = n/10;
		}
		
		
	}
	public boolean checkhash(int [] arr){
		
	
	for(int i=0;i<10;i++){
		if(arr[i] != 1){
			return false;
		}
	}
	return true;
	}
	public static void main(String [] args){
		BleatrixSolution BT = new BleatrixSolution();
		int T,i,caseno=0;
		
		 String fileName = "A-large-practice.in";

	        // This will reference one line at a time
	        String line = null;

	        try {
	        	PrintWriter writer = new PrintWriter("large-output.txt", "UTF-8");
	        	
	            // FileReader reads text files in the default encoding.
	            FileReader fileReader = 
	                new FileReader(fileName);

	            // Always wrap FileReader in BufferedReader.
	            BufferedReader bufferedReader = 
	                new BufferedReader(fileReader);

	            while((line = bufferedReader.readLine()) != null) {
	                //System.out.println(line);
	            	int val = Integer.parseInt(line);
	            	int [] arr = new int[10];
	    			boolean check = false;
	    			i=1;
	    		//	int val = sc.nextInt();
	    			if(val == 0){
	    				//System.out.println("Case:" + caseno +" INSOMNIA");
	    				writer.println("Case #" + caseno +": INSOMNIA");
	    	        	
	    	        	
	    				caseno++;
	    			}
	    			else{
	    			while(true){
	    				int iN = i*val;
	    				//System.out.println(iN);
	    				BT.splitdigitsandhash(iN,arr);
	    				check=BT.checkhash(arr);
	    				if(check){
	    					//System.out.println("Case:" + caseno + " " +iN);
	    					writer.println("Case #" + caseno + ": " +iN);
	    					caseno++;
	    					break;
	    				}
	    				i++;
	    			
	    			}}
	    	
	    			
	    			
	            }   

	            // Always close files.
	            bufferedReader.close();         
	            writer.close();

	        }
	        catch(FileNotFoundException ex) {
	            System.out.println(
	                "Unable to open file '" + 
	                fileName + "'");                
	        }
	        catch(IOException ex) {
	            System.out.println(
	                "Error reading file '" 
	                + fileName + "'");                  
	            // Or we could just do this: 
	            // ex.printStackTrace();
	        }
	        
	        
		
		
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//String   = br.readLine().split(" ");
	//	Scanner sc = new Scanner(System.in);
	//	T = sc.nextInt();
//		int testcase = T;
	//	if(T<1 || T>100) return;
	//	while(T>0){
		//		T--;
	//	}
	}

}
