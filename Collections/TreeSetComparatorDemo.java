package Collections;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetComparatorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t = new TreeSet(new MyComparator());
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		t.add(20);
		System.out.println(t);

	}

}
class MyComparator implements Comparator
{
	
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Integer I1=(Integer) o1;
		Integer I2= (Integer) o2;
		if(I1<I2)
			return +1;
		else if(I1>I2)
			return -1;
		else
		return 0;
	}
}
