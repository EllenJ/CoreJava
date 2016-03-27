package Collections;

import java.util.*;

public class BinarySearchDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList l = new ArrayList();
		l.add(15);
		l.add(0);
		l.add(20);
		l.add(10);
		l.add(5);
		System.out.println(l);
		Collections.sort(l,new MyComparator8());
		System.out.println(l);
		System.out.println(Collections.binarySearch(l, 10,new MyComparator8()));
		System.out.println(Collections.binarySearch(l, 13,new MyComparator8()));
		System.out.println(Collections.binarySearch(l, 17,new MyComparator8()));
		

		

	}

}
class MyComparator8 implements Comparator<Integer>
{

	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		Integer i1= (Integer)o1;
		Integer i2=(Integer)o2;
		
		return i2.compareTo(i1);
	}
	
}

