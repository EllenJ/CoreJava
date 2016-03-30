package Collections;

import java.util.Date;

public class Person {
	
	String fName;
	String lName;
	public Person(String fName, String lName) {
		super();
		this.fName = fName;
		this.lName = lName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fName == null) ? 0 : fName.hashCode());
		result = prime * result + ((lName == null) ? 0 : lName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (fName == null) {
			if (other.fName != null)
				return false;
		} else if (!fName.equals(other.fName))
			return false;
		if (lName == null) {
			if (other.lName != null)
				return false;
		} else if (!lName.equals(other.lName))
			return false;
		return true;
	}
	
	
//	public String getfName() {
//		return fName;
//	}
//	public void setfName(String fName) {
//		this.fName = fName;
//	}
//	public String getlName() {
//		return lName;
//	}
//	public void setlName(String lName) {
//		this.lName = lName;
//	}
//	public int compareTo(Person o) {
//		
//		return this.getfName().compareTo(o.getfName());
//		
//	}
//	
	}
		

