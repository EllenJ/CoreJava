package MyJava;

public class Person {

	/**
	 * @param args
	 */
	private String fname;
	private String lname;
	
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	/*public boolean equals(Person p){
		 
		return p.fname.equals(fname) && p.lname.equals(lname);
	}
	*/
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fname == null) ? 0 : fname.hashCode());
		result = prime * result + ((lname == null) ? 0 : lname.hashCode());
		return result;
	}
	@Override
	public boolean equals(Person obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		
		
		if (fname == null) {
			if (obj.fname != null)
				return false;
		} else if (!fname.equals(obj.fname))
			return false;
		if (lname == null) {
			if (obj.lname != null)
				return false;
		} else if (!lname.equals(obj.lname))
			return false;
		return true;
	}
	
}
