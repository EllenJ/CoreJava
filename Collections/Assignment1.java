package Collections;

import java.util.ArrayList;
import java.util.List;

public class Assignment1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("kusuma");
		String s2 = new String ("venkatesh");
		String s3 = new String("kusuma");
		List<String>  al = new ArrayList();
				al.add(s1);
				al.add(s2);
				  System.out.println(al.contains(s3)); 

	}

}
