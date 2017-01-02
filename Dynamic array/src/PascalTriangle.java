import java.io.*;
import java.util.*;



public class PascalTriangle {

	
    public static void main(String[] args) {

    	Scanner in = new Scanner(System.in);
    	long noOfRows = in.nextInt();
    	long column = in.nextInt();
        //int noOfRows = 10;
        long counter = 1;
        List<Long> list = new ArrayList<Long>();
        list.add(1L);
       long count = 1;
      
        list = itMe(list, counter,noOfRows,count,column);
  //     System.out.println(list);
    }

    public static List<Long> itMe(List<Long> list, long counter,long noOfRows,long count,long column) {
    	 System.out.println("\n");
    	 System.out.println(list);
    	  if(counter != noOfRows){
    		  int colcnt = 0;
       

        List<Long> tempList = new ArrayList<Long>();

        tempList.add(1L);
        count++;
        colcnt++;
     //   System.out.println("1");
        //System.out.println("SIZE" +list.size());
        for (int i = 1; i < list.size(); i++) {
        	
        	long valuechk = (long) (list.get(i) + list.get(i-1));
        //	System.out.println(valuechk);
        	if(valuechk % 7!=0 && colcnt<column){
        		count++;
        	colcnt++;
        //	  System.out.println(valuechk);
        		
        	}
        	
            tempList.add(valuechk);
        }
      
        tempList.add(1L);
       
        if(colcnt<column){
        	colcnt++;
        count++;
    //    System.out.println("1");
    
        }
    	   itMe(tempList, ++counter,noOfRows,count,column);
    	  }
    	  else{
    		  System.out.println(count);
    	  }
        
        return list;
    }
}