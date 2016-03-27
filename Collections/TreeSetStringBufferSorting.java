package Collections;

import java.util.Comparator;
import java.util.TreeSet;

import org.omg.CORBA.Object;

public class TreeSetStringBufferSorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t = new TreeSet(new MyComparator2());
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("K"));
		t.add(new StringBuffer("L"));
		System.out.println(t);
	}

}

class MyComparator2 implements Comparator {
	
	

	public int compare(java.lang.Object obj1, java.lang.Object obj2) {
		// TODO Auto-generated method stub
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		return s1.compareTo(s2);
	}

	
}