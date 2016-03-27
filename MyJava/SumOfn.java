package MyJava;
import java.util.Scanner;

public class SumOfn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner s1 = new Scanner(System.in);
	    System.out.println("enter the number: ");
	    int sum;
		int n=s1.nextInt() ;
		sum =n*(n+1)/2;
		System.out.println("the sum of a n = " +sum);
		int r=0;
		for(int i=n;i>=0;i--)
		{
			r=r+i;
			
		}
		System.out.println("the sum2 of n="+r);
	}

}
