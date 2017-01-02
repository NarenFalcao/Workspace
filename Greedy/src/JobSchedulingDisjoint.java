import java.util.*;

class Disjoint{
	int parent[];
	
	Disjoint(int m){
		parent = new int[m+1];
		for(int i=0;i<=m;i++)
			parent[i] = i;
		
	}
	
	int find(int s){
		if(s!=parent[s])
			return parent[s] = find(parent[s]);
		else
			return s;
		
	}
	
	void merge(int u,int v){
		parent[v] = u;
		
	}
}
public class JobSchedulingDisjoint implements Comparator<JobSchedulingDisjoint> {
	
	char id;
	int deadline;
	int profit;
	
	JobSchedulingDisjoint(){}
	
	JobSchedulingDisjoint(char a,int b,int c){
		this.id = a;
		this.deadline = b;
		this.profit = c;
		}
	
	public int compare(JobSchedulingDisjoint a, JobSchedulingDisjoint b){
		return (a.profit>b.profit)?-1:1;
	}
	
	
public static int findMaxDeadline(ArrayList<JobSchedulingDisjoint> arr){
	int max = Integer.MIN_VALUE;
	
	for(int i=0;i<arr.size();i++){
		JobSchedulingDisjoint obj = (JobSchedulingDisjoint)arr.get(i);
		if(obj.deadline>max)
			max = obj.deadline;
	}
	
	
	return max;
}
	
public static void SchedulingUtil(ArrayList<JobSchedulingDisjoint> arr){
	
	Collections.sort(arr,new JobSchedulingDisjoint());
	int max = findMaxDeadline(arr);
	Disjoint obj  = new Disjoint(max);
	
	for(JobSchedulingDisjoint Temp : arr){
		int val = obj.find(Temp.deadline);
		
		if(val>0){
			
			obj.merge(obj.find(val-1),val);
			System.out.println(Temp.id);
		}
		
	}
	
	
}
	
	
	public static void main(String args[]){
		ArrayList<JobSchedulingDisjoint> Jobs = new ArrayList<JobSchedulingDisjoint>();
		
		Jobs.add(new JobSchedulingDisjoint('a',2,100));
		Jobs.add(new JobSchedulingDisjoint('b',1,19));
		Jobs.add(new JobSchedulingDisjoint('c',2,27));
		Jobs.add(new JobSchedulingDisjoint('d',1,25));
		Jobs.add(new JobSchedulingDisjoint('e',3,15));
		
		
		SchedulingUtil(Jobs);
		
		
	}
}
