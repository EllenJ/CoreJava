package MyJava;

import java.util.Scanner;

public class RandomNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=s1.nextInt();
		
		n= Math.random();
		
		System.out.println(n);
	}

}
