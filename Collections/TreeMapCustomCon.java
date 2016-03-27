package Collections;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapCustomCon {
	public static void main(String[] args) {
		TreeMap t =new TreeMap(new MyComparator5());
		t.put("XXX", 10);
		t.put("AAA",20);
		t.put("ZZZ",30);
		t.put("LLL",40);
		System.out.println(t);
		
	}

}
class MyComparator5 implements Comparator
{

	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String s1 = o1.toString();
		String s2=o2.toString();
		
		return s2.compareTo(s1);
	}
}
