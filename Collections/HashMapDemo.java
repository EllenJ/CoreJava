package Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class HashMapDemo {
	private static final String Entry = null;

	public static void main(String[] args) {
		HashMap m = new HashMap();
		m.put("chiranjeevi", 700);
		m.put("balaiah",800);
		m.put("venkatesh", 200);
		m.put("nagarjuna", 500);
		System.out.println(m);
		System.out.println(m.put("chiranjeevi", 1000));
		Set s=m.keySet();
		System.out.println(s);
Collection c= m.values();
System.out.println(c);
Set s1 =m.entrySet();
System.out.println(s1);
Iterator itr = (Iterator) s1.iterator();
while((((java.util.Iterator) itr).hasNext())
{
	Map(Entry) m1=itr.next();
	System.out.println(m1.getKey()+ "...." +m1.getValue());
	if(m1.getKey().equals("nagarjuna"))
	{
		m1.setValue(10000);
	}
		
}
System.out.println(m);
	}

}
