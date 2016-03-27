package Collections;

import java.util.Stack;

public class StackDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		
		s.push("A");
		s.push("B");
		s.push("c");
		System.out.println(s);
		System.out.println(s.search("A"));
		System.out.println(s.search("z"));

	}

}
