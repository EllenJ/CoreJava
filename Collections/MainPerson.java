package Collections;

import java.util.*;

public class MainPerson {
	public static void main(String[] args) {
		Person p1=new Person();
		Person p2=new Person();
		Person p3=new Person();

		p1.setfName("venkatesh");
		p1.setlName("kyama");
			p2.setfName("kusuma");
			p2.setlName("kyama");
			p3.setfName("kusuma");
			p3.setlName("jetta");
			
		List<Person> l1=new ArrayList<Person>( );
		l1.add(p1);
		l1.add(p2);
		l1.add(p3);
Collections.sort(l1,new MyComparator11());		
		for (Person person : l1) {
			
		
			System.out.println(person.getlName()+ ","+ person.getfName());
			
		}
		
	
		
	}
}
	class MyComparator11 implements Comparator<Person>
	{
		public int compare(Person o1, Person o2) {
			// TODO Auto-generated method stub
			String s1=o1.getfName();
			String s2=o2.getfName();
			String s3=o1.getlName();
			String s4=o2.getlName();
			if(s1.equals(s2))
			{
				return s3.compareTo(s4);
			}
			return s1.compareTo(s2);
		}
	
	}


