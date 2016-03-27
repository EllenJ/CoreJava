package inClass;

import java.util.Scanner;

public class EvenNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner scan= new Scanner(System.in);
		System.out.println("enter number: ");
		int num=scan.nextInt();
		for(int i=0;i<num;i++){
			
			n=i%2;
			if(n==0)
			{
				System.out.println("even numbers of n: " +i);	
			}
			
		}

	}

}
