package MyJava;

import java.util.Scanner;

public class MatrixMult {

	/**
	 * @param args
	 */
	static int[] a;
	static
	{
		int i=3;
	 a[3] = {1,2,3};
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter 2*2 MATRIX:");
		int m=2,n=2;

		int[][] m1 = new int[m][n];
		
		for(i=1;i<=m;i++)
		{

			for(j=1;j<=n;j++){
			}
			m1[i][j]= s1.nextInt();
			m1[i][j]= s1.nextInt();

		}
		
	
	}

}
