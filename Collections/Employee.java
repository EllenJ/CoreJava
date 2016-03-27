package Collections;
import java.util.*;

public class Employee implements Comparable {
	int eid;
	String name;
	Employee(String name,int eid)
	{
		this.name=name;
		this.eid=eid;
		
	}
	public String toString()
	{
		return name+ "--" +eid;
	}
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		int eid1=this.eid;
		Employee e= (Employee)o;
		int eid2 =e.eid;
		if(eid1<eid2)
		{
			return -1;
		}
		else if(eid1>eid2)
		{
			return 1;
		}
		else return 0;
	}
	
}
class CompComp
{
	public static void main(String[] args)
	{
		Employee e1 = new Employee("nag",100);
		Employee e2 = new Employee("balaiah",200);
		Employee e3 = new Employee("chiru",50);
		Employee e4 = new Employee("venki",150);
		Employee e5 = new Employee("nag",100);
		TreeSet t=new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		System.out.println(t);
			
	}
}
class MyComparator4 implements Comparator
{

	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Employee e1=(Employee)o1;
		Employee e2=(Employee)o2;
		String s1=e1.name;
		String s2=e2.name;
		return s1.compareTo(s2);
	}
	
}
