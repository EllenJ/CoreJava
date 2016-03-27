package Collections;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysBinarySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={10,2,20,11,6};
		Arrays.sort(a);
		System.out.println(Arrays.binarySearch(a,6));
		System.out.println(Arrays.binarySearch(a,14));
		String[] s={"A","z","B"};
		Arrays.sort(s);
		System.out.println(binarySearch(s,"Z"));
		System.out.println(binarySearch(s,"S"));
		Arrays.sort(s,new MyComparator10());
		System.out.println(binarySearch(s,"Z",new MyComparator10()));
		System.out.println(binarySearch(s,"S",new MyComparator10()));
		System.out.println(binarySearch(s,"N"));
		

	}

	private static char[] binarySearch(String[] s, String string, MyComparator10 myComparator10) {
		// TODO Auto-generated method stub
		return null;
	}

}
class MyComparator10 implements Comparator<String>
{

	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		String s1=(String)o1;
		String s2=(String)o2;
		
		return s2.compareTo(s1);
	}
	
}
