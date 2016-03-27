package Collections;

import java.util.Arrays;
import java.util.Comparator;

public class UtilityArrayDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={10,2,20,11,6};
		System.out.println("primitive array before sorting");
		for (int a1 : a) {
			System.out.println(a1);
		}

		Arrays.sort(a);
		System.out.println("premitive array after sorting");
		for (int a1 : a) {
			System.out.println(a1);
		}
		String[] s ={"A","Z","B"};
		System.out.println("object array before sort");
		for (String a2 : s) {
			System.out.println(a2);
		}
		Arrays.sort(s);
		System.out.println("object array after sort");
		for (String a1 : s) {
			System.out.println(a1);
		}
		Arrays.sort(s,new MyComparator9());
		System.out.println("onject array after sorting with comparator");
		for (String a1 : s) {
			System.out.println(a1);
		}
	}

}
class MyComparator9 implements Comparator<String>
{

	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		String s1=o1.toString();
		String s2=o2.toString();
		
		return s2.compareTo(s1);
	}
	
}
