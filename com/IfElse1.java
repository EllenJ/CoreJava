package com;

import java.util.Scanner;

public class IfElse1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the age:");
		int age=scan.nextInt();
		if(age>60){
			System.out.println("Elgible for discuount");
		}
		else
		{
			System.out.println("Not elgible");
		}
	}

}
