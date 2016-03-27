package Collections;
import java.util.ArrayList;
import java.util.Collections;


public class CollectionsReverse {

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
		Collections.reverse(l);
		System.out.println(l);

	}

}
