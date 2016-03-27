package inClass;

import java.util.Scanner;

public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		System.out.println("enter num:");
		int num=s1.nextInt();
		int res=1;
		for(int i=1;i<num;i++){
			
			
			res=res*i;
			
			
					}
		System.out.println(res);
	}

}