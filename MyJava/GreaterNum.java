package MyJava;

import java.util.Scanner;

public class GreaterNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the numbers of a,b,c : ");
		int a=s1.nextInt();
		int b=s1.nextInt();
		int c=s1.nextInt();
		if(a<b && c<b)
		{
			System.out.println("b is greater than a and c");
		}else if(b<a && c<a){
			System.out.println("a is greater than b and c");
		}else
			System.out.println("c is greater than a and b");
			

	}

}
