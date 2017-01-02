import java.io.*;
import java.util.*;

public class StableMarriageProblemUtil {
	
	public static void main(String args[])
	{

		
		int [][] prefer = new int[][] {{7, 5, 6, 4},
		        {5, 4, 6, 7},
		        {4, 5, 6, 7},
		        {4, 5, 6, 7},
		        {0, 1, 2, 3},
		        {0, 1, 2, 3},
		        {0, 1, 2, 3},
		        {0, 1, 2, 3},
		    };
		//    StableMarriageProblem singleton  = new StableMarriageProblem(); // this line uncomment and check, the constructor wont be visible
		StableMarriageProblem object = StableMarriageProblem.getInstance();
		    object.stablemarriage(prefer);
		
		
	}

}
