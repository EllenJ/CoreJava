package Collections;

import java.util.Comparator;
import java.util.TreeSet;


public class TreeSetStringSorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t = new TreeSet(new MyComparator1());	
			t.add("roja");
			t.add("shobharani");
			t.add("rajakumari");
			t.add("gangaBhavani");
			t.add("ramulamma");
			System.out.println(t);
		
	}
}
class MyComparator1 implements Comparator
{
	

	public int compare(Object o1, Object o2) {
		String s1= o1.toString();
		String s2= (String)o2;
		return s2.compareTo(s1);
	}
}
