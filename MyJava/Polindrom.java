package MyJava;
import java.util.*;
public class Polindrom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,res=0, p;
		System.out.println("enter n:");
		Scanner s1=new Scanner(System.in);
		int n=s1.nextInt();
		num=n;
		while(num > 0)
		{
			p = num%10;
//			System.out.println("print p="+p);
			res= res*10+p;
//			System.out.println("print res="+res);
			num=num/10;
//			System.out.println(n);
		}
		if(res == n)
		
			System.out.println("this a polindrom number" +res);
		else
		
			System.out.println("this is not a polindrom number"+ res);
		

	}

}
