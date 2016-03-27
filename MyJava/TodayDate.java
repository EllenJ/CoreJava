package MyJava;

import java.util.Date;
import java.util.Scanner;

public class TodayDate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner s1=new Scanner(System.in);
//		System.out.println("Enter date formate");
//		String d=s1.next();
		Date d1=new Date();
		
		Date d=d1.getDate();
		
		System.out.println(d.getDate());
	}

}
