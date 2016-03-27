package Collections;

import java.util.ArrayList;
import java.util.Collections;


public class CollectionsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList l = new ArrayList();
		l.add("Z");
		l.add("A");
		l.add("K");
		l.add("N");
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);

	}

}
