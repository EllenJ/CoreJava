package Collections;

import java.util.Comparator;
import java.util.PriorityQueue;

public class CustomizedPriorityQ {

	private static final Comparator MyComparator6 = null;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue q=new PriorityQueue(15,new MyComparator6());
		q.offer("Z");
		q.offer("L");
		q.offer("B");
		System.out.println(q);

	}

}
class MyComparator6 implements Comparator
{

	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String s1=(String) o1;
		String s2=(String) o2;
		return s2.compareTo(s1);
		
	}
	
}