import java.io.*;
import java.util.*;

public class OptimalPolygonTriangulation {
int x,y;

OptimalPolygonTriangulation(int a,int b){
	this.x = a;
	this.y = b;
}

static double dist(OptimalPolygonTriangulation p1,OptimalPolygonTriangulation p2){
	
	return Math.sqrt((p1.x-p2.x)*(p1.x-p2.x) +(p1.y-p2.y)*(p1.y-p2.y));
}
static double cost(int i,int k,int j,OptimalPolygonTriangulation [] obj){
	OptimalPolygonTriangulation p1 = obj[i];
	OptimalPolygonTriangulation p2 = obj[k];
	OptimalPolygonTriangulation p3 = obj[j];
	return dist(p1,p2)+dist(p2,p3)+dist(p3,p1);
	
}

static double optimalT(OptimalPolygonTriangulation [] obj,int n){
	if(n<3)
		return 0;
	double  [][] table = new double[n][n];
	
	for(int g=0;g<n;g++){
		for(int i=0,j=g;j<n;j++,i++){
			if(j<i+2)
				table[i][j] = 0.0;
			else{
				table[i][j] = Integer.MAX_VALUE;
				for(int k=i+1;k<j;k++){
					double val = table[i][k]+table[k][j]+cost(i,k,j,obj);
					if(val<table[i][j])
						table[i][j] = val;
				}
				
			}
			
		}
		
	}
	
	
return table[0][n-1];	
}

public static void main (String args[]){
	int n=5;
	Scanner in = new Scanner(System.in);
	
	OptimalPolygonTriangulation [] obj = new OptimalPolygonTriangulation[n];
	for(int i=0;i<n;i++){
		int x = in.nextInt();
		int y = in.nextInt();
		obj[i] = new OptimalPolygonTriangulation(x,y);
		//use this values 
		//{{0, 0}, {1, 0}, {2, 1}, {1, 2}, {0, 2}};
		//O(n3) complexity
	}
	double answer = optimalT(obj,n);
	System.out.println(answer);
	
}
	
}
