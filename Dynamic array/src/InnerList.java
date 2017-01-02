import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.io.*;
import java.util.*;


public class InnerList {
	public static void main(String [] args){
		
		 int mainGridSize = 81;
		    int innerGridSize = 9;

		    /* Your master grid. */
		    List<List<Integer>> mainList = new ArrayList<List<Integer>>(mainGridSize);

		    /* Your inner grid */
		    List<Integer> innerList = null;

		    /* Loop around the mastergrid */
		    for (int i=0; i<mainGridSize; i++) {

		        /* create one inner grid for each iteration of the main grid */
		        innerList = new ArrayList<Integer>(innerGridSize);

		        /* populate your inner grid */
		        for (int j=0; j<innerGridSize; j++) 
		            innerList.add(j);

		        /* add it to your main list */
		        mainList.add(innerList);
		    }
		    
	}

}
