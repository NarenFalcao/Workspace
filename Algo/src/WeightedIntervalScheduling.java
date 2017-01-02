// Java program for Weighted Job Scheduling in O(nLogn)
// time
import java.util.Arrays;
import java.util.Comparator;
 
// Class to represent a job
class Job
{
    int start, finish, profit, power;
 
    // Constructor
    
    int costfunction(int start,int finish,int power){
    	return (finish - start)*power;
    	
    	
    }
    Job(int start, int finish, int power , int profit)
    {
        this.start = start;
        this.finish = finish;
        this.power = power;
        this.profit = costfunction(start,finish,power);
        //this.profit = profit;
    }
}
 
// Used to sort job according to finish times
class JobComparator implements Comparator<Job>
{
    public int compare(Job a, Job b)
    {
        return a.finish < b.finish ? -1 : a.finish == b.finish ? 0 : 1;
    }
}
 
public class WeightedIntervalScheduling
{
    /* A Binary Search based function to find the latest job
      (before current job) that doesn't conflict with current
      job.  "index" is index of the current job.  This function
      returns -1 if all jobs before index conflict with it.
      The array jobs[] is sorted in increasing order of finish
      time. */
    static public int binarySearch(Job jobs[], int index)
    {
        // Initialize 'lo' and 'hi' for Binary Search
        int lo = 0, hi = index - 1;
 
        // Perform binary Search iteratively
        while (lo <= hi)
        {
            int mid = (lo + hi) / 2;
            if (jobs[mid].finish <= jobs[index].start)
            {
                if (jobs[mid + 1].finish <= jobs[index].start)
                    lo = mid + 1;
                else
                    return mid;
            }
            else
                hi = mid - 1;
        }
 
        return -1;
    }
 
   

    
    // The main function that returns the maximum possible
    // profit from given array of jobs
    static public int schedule(Job jobs[])
    {
        // Sort jobs according to finish time
        Arrays.sort(jobs, new JobComparator());
       for(int q = 0;q<jobs.length;q++){
    	   
    	   System.out.println("START" +jobs[q].start);
    	   System.out.println("END" +jobs[q].finish);
    	   System.out.println("POWER" +jobs[q].power);
    	   System.out.println("PROFIT" +jobs[q].profit);
    	   System.out.println();
       }
        
        // Create an array to store solutions of subproblems.
        // table[i] stores the profit for jobs till jobs[i]
        // (including jobs[i])
        int n = jobs.length;
      Job joblist[] = new Job[n];
        int table[] = new int[n];
        table[0] = jobs[0].profit;
        joblist[0] = jobs[0];
        // Fill entries in M[] using recursive property
        for (int i=1; i<n; i++)
        {
            // Find profit including the current job
            int inclProf = jobs[i].profit;
            int l = binarySearch(jobs, i);
          //  System.out.println(l);
            if (l != -1)
                inclProf += table[l];
 
            // Store maximum of including and excluding
            table[i] = Math.max(inclProf, table[i-1]);
            
           
            // Store maximum of including and excluding
            if (inclProf > table[i-1])
            {
                joblist[i] = jobs[l]; 
                joblist[i+1] = jobs[i];
     
                // including previous jobs and current job
               // DP[i].job = DP[l].job;
                //DP[i].job.push_back(arr[i]);
     
            }
            else
                // excluding the current job
              //  DP[i] = DP[i - 1];
            	joblist[i] = jobs[i-1];
            
        }
 
        for(int i=0;i<table.length;i++)
        	System.out.println(table[i]);
     
        
        
        System.out.println("SCHEDULED");
        for(int q = 0;q<joblist.length;q++){
     	  
     	   System.out.println("START" +joblist[q].start);
     	   System.out.println("END" +joblist[q].finish);
     	   System.out.println("POWER" +joblist[q].power);
     	   System.out.println("PROFIT" +joblist[q].profit);
     	   System.out.println();
        }
        	
        return table[n-1];
    }
 
    // Driver method to test above
    public static void main(String[] args)
    {
        Job jobs[] = {new Job(1, 2, 5, 50), new Job(5, 30, 6, 150), new Job(3, 5, 7, 20),
                      new Job(6, 19, 7, 100),new Job(20, 35,4, 50), new Job(25, 60,6, 50),new Job(30 , 80,7, 70), new Job(2, 100,5, 200)};
 
        System.out.println("Optimal profit is " + schedule(jobs));
    }
}