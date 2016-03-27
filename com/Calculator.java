package com;

import java.util.Scanner;

public class Calculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number of a: ");
		int a=scan.nextInt();
		System.out.println("Enter the number of b: ");
		int b=scan.nextInt();
		System.out.println("Addintion of two numbers: "+(a+b));
		System.out.println("Subtraction of two numbers:"+(a-b));
		System.out.println("Multiplication of two numbers: "+(a*b));
		System.out.println("Division of two numbers:"+(a/b));
		if(a>b)
		{
			System.out.println("a is greater than b");
		}
		else
		{
			System.out.println("b is greater than a");
		}
			
		

	}

}
