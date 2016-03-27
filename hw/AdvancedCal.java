package hw;

import java.util.Scanner;

public class AdvancedCal {

	public int findGnum(){
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
		
		return 0;
	}
	public String reverseString(){
		
		String s1="KUSUMA";
		for(int i=0;i<=0;i++)
		{
			for(int j=5;j>=i;j--)
			{
			System.out.print(s1.charAt(j));
		}
		
		

	}
		return " ";
	}
	public int primeNum(){
		
		Scanner s1=new Scanner(System.in);
		System.out.println("enter n: ");
		int n=s1.nextInt();
		if(n%2==1)
		{
			System.out.println("It is a prime number");
		}else
			
					System.out.println("it is not a prime number");
		

		return 0;
	}
	public int randomNum(){
		return 1;
	}
	public int todayDate(){
		return 1;
	}

}
