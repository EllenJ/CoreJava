package Collections;

import java.util.LinkedList;

public class LinkedListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l = new LinkedList();
		l.add("durga");
		l.add(30);
		l.add(null);
		l.add("durga");
		System.out.println(l);
		l.set(0, "software");
		System.out.println(l);

		l.set(3,"venky");
		System.out.println(l);

		l.removeLast();
		System.out.println(l);

		l.addFirst("CCC");
		System.out.println(l);

	}

}
