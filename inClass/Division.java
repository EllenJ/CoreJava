package inClass;

import java.util.Scanner;

public class Division {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner scan= new Scanner(System.in);
		System.out.println("enter number: ");
		int num=scan.nextInt();
		for(int i=0;i<num;i++){
			
			
			if(i%3==0 && i%5==0)
			{
				System.out.println(i);
			}
		}

	}

}
