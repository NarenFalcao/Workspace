import java.io.*;
import java.util.*;
 
class bfsshortreach
{
    private int V;   
    private LinkedList<Integer> adj[];  
    bfsshortreach(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }
 
    void addEdge(int v,int w)
    {
        adj[v-1].add(w-1);
    }
 
    void BFS(int s,int arr[])
    {
        boolean visited[] = new boolean[V];
 
        LinkedList<Integer> queue = new LinkedList<Integer>();
 
        visited[s]=true;
        queue.add(s);
 int sum=0;
        while (queue.size() != 0)
        {
            s = queue.poll();
            sum+=6;
 
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext())
            {
                int n = i.next();
                if (!visited[n])
                {
                    visited[n] = true;
                    arr[n] = sum;
                    queue.add(n);
                }
            }
        }
    }
 
    // Driver method to
    public static void main(String args[])
    {
    	
 Scanner in = new Scanner(System.in);
 int Q = in.nextInt();
 
 while(Q!=0){
 int N = in.nextInt();
 bfsshortreach g = new bfsshortreach(N);
 int E = in.nextInt();
 
 for(int i=0;i<E;i++){
 int u = in.nextInt();
 int v = in.nextInt();
	 g.addEdge(u, v);
 }
      
        int val[] = new int[N];
        for(int i=0;i<N;i++)
        	val[i]= -1;
        
        int start = in.nextInt();
        start--;
        g.BFS(start,val);
        
        
        for(int i=0;i<N;i++){
        if(i!=start)
        	System.out.print(val[i]);
        }
        System.out.println();
 Q--;
 }
 }
 
}