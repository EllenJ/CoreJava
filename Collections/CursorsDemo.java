package Collections;

import java.util.Enumeration;
import java.util.*;

import javax.swing.text.html.HTMLDocument.Iterator;

public class CursorsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v= new Vector();
		Enumeration e= v.elements();
		java.util.Iterator itr= v.iterator();
		ListIterator litr=v.listIterator();
		System.out.println(e.getClass().getName());
		System.out.println(itr.getClass().getName());
		System.out.println(litr.getClass().getName());
	}

}
