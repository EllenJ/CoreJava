package Collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class ArrayListListIterator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l = new LinkedList();
		l.add("balakrishna");
		l.add("chiru");
		l.add("venky");
		l.add("nag");
		System.out.println(l);
		ListIterator ltr= l.listIterator();
		while(ltr.hasNext())
		{
			String s = (String)ltr.next();
			if(s.equals("venky"))
			{
				ltr.remove();
			}
			else if(s.equals("nag"))
			{
				ltr.add("chaitu");
			}
			else if (s.equals("chiru"))
			{
				ltr.set("charan");
				
			}
		}
		System.out.println(l);
	}

}
