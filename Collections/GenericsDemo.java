package Collections;

class Gen<T>
{
	T ob;
	Gen(T ob)
	{
		this.ob=ob;
	}
	public void show()
	{
		System.out.println("get class name" +ob.getClass().getName());
	}
	public T getob()
	{
		return ob;
	}
}
public class GenericsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gen<String> g1 = new Gen<String>("Durga");
		g1.show();
		System.out.println(g1.getob());
		Gen<Integer> g2 = new Gen<Integer>(10);
		g1.show();
		System.out.println(g2.getob());

		Gen<Double> g3 = new Gen<Double>(10.5);
		g1.show();
		System.out.println(g3.getob());

		

	}

}
