package Collections;

import java.util.ArrayList;
import java.util.List;

public class Asign {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("kusuma","Kyama");
		Person p2 = new Person("venkatesh","kyama");
		Person p3 = new Person("kusuma", "Kyama");
		List<Person>  Al = new ArrayList();
		Al.add(p1);
		Al.add(p2);
		//Al.add(p3);
		 System.out.println(Al.contains(p3)); 

	}

}
