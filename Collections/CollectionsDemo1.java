package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add("Z");
		al.add("A");
		al.add("K");
		al.add("N");
		System.out.println(al);
		Collections.sort(al,new MyComparator7());
		System.out.println("after sorting" +al);
	}

}
class MyComparator7 implements Comparator
{

	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String s1=(String)o1;
		String s2=(String)o2;
		
		return s2.compareTo(s1);
	}
	
}