package Collections;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Hashtable;

public class HashtableHashCode {
	public static void main(String[] args) {
		Hashtable h=new Hashtable();
		h.put(new Temp1(5), "A");
		h.put(new Temp1(2), "B");
		h.put(new Temp1(6), "c");
		h.put(new Temp1(15), "D");
		h.put(new Temp1(23), "E");
		h.put(new Temp1(16), "F");
		System.out.println(h);
	}

}
class Temp1
{
	int i;
	public Temp1(int i) {
		// TODO Auto-generated constructor stub
		this.i=i;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + i;
		return result;
	}
	@Override
	public String toString() {
		return "Temp [i=" + i + "]";
	}
	
	
	
}
