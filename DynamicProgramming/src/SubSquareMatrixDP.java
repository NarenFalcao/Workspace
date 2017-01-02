import java.util.*;

public class SubSquareMatrixDP {
	
	
	void submatrix(int [][]mat,int m,int n){
		int s[][] = new int [m][n];
		int max=0;
		int row=0,col=0;
		
		for(int i=0;i<m;i++)
			s[i][0] = mat[i][0];
		for(int i=0;i<n;i++)
			s[0][i] = mat[0][i];
		
		
		for(int i=1;i<m;i++){
			for(int j=1;j<n;j++)
			{
				if(mat[i][j]==1){
					int temp = Math.min(s[i][j-1],s[i-1][j]);
					s[i][j] = Math.min(temp,s[i-1][j-1])+1;
					if(s[i][j]>max){
						max=s[i][j];
						row =i;
						col = j;
					}
					
				}
				else
					s[i][j] = 0;
			}
		}
		
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++ ){
					System.out.print(s[i][j] +" ");
			}
			System.out.println();
		}
		
		System.out.println("SUB MATRIX");
		System.out.println(max +" " +row +" " +col);
		
		for(int i=row-max+1;i<=row;i++)
		{
			for(int j=col-max+1;j<=col;j++){
				System.out.print(mat[i][j] +" ");
			}
		System.out.println();
		}
		
		
	}
	
	
	public static void main(String args[]){
		SubSquareMatrixDP o = new SubSquareMatrixDP();
		
		int mat[][] = new int[][] { {0,1,1,0,1},
			{1,1,0,1,0},
			{0,1,1,1,0},
			{1,1,1,1,0},
			{1,1,1,1,1},
			{0,0,0,0,0}};
		
			o.submatrix(mat,6,5);
			
			
			
			
		
		
		
	}

}
