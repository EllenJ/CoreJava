package MyJava;
import java.util.Scanner;

public class Fibanacci {
	public static void main(String[] args) {
		int a=0,b=1;
		System.out.println("Enter the number of N= ");
		Scanner s1=new Scanner(System.in);
		int n= s1.nextInt();
		
		System.out.println(+a);
		System.out.println(+b);
		for(int i=2;i<n;i++)
		{
			i=a+b;
			a=b;
			b=i;
			
			System.out.println(i);
			if(i==n){
				break;
			}
			
			}
				
			
		}
	}


