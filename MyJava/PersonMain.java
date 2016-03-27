package MyJava;

public class PersonMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person obj1=new Person();
		Person obj2=new Person();
		Person obj3=new Person();
		obj1.setFname("kusuma");
		obj1.setLname("kyama");
		obj2.setFname("venkatesh");
		obj2.setLname("kyama");
		obj3.setFname("kusuma");
		obj3.setLname("kyama");
		if(obj1.equals(obj2))
		{
			System.out.println("object1 and object 2 are equal");
		}
		else if(obj1.equals(obj3))
		{
			System.out.println("object1 and object 3 are equal");
		}
		
		System.out.println("Hello");
		
	}


}
