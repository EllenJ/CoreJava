package MyJava;

import java.util.Scanner;


public class Prime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		System.out.println("enter n: ");
		boolean isTrue=true;
		int n1;
		int n=s1.nextInt();
		for(int i=2; i<=n/2;i++)
		{
			n1=n%i;
		if(n1==0)
		{
		isTrue = false;
		break;
		}
		}
		s1.close();
		if(isTrue)
		{
			System.out.println("It is a prime number");

		}
		else
			System.out.println("It is not a prime number");

	}

	}

