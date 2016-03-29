package Collections;

import java.util.Date;

public class Person implements Comparable<Person> {
	
	String fName;
	String lName;
	
	
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public int compareTo(Person o) {
		
		return this.getfName().compareTo(o.getfName());
		
	}
	
	}
		

