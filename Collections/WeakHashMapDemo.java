package Collections;

import java.util.HashMap;

public class WeakHashMapDemo {
	public static void main(String[] args)throws Exception {
		HashMap m= new HashMap();
		Temp t= new Temp(10);
		m.put(t,"Durga");
		System.out.println(m);
		t=null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(m);
		
	}

}
class Temp
{
	int i;
	public Temp(int i) {
		// TODO Auto-generated constructor stub
		this.i=i;
	}
	public String toString()
	{
		return "temp";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + i;
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
		Temp other = (Temp) obj;
		if (i != other.i)
			return false;
		return true;
	}
	public void finalize()
	{
		System.out.println("Finalize method called");
	}
}