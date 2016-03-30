package MyJava;

public class Animal {

	/**
	 * @param args
	 */
	
	String name;
	int nolegs;
	int noeyes;
	
	public void speaking(){
		System.out.println("it speaks");
	}
	
	public void eating(){
		System.out.println("it eats");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c= new Cat();
		Dog d= new Dog();
		d.speaking();
		c.speaking();
		c.eating();
		d.eating();
		
		

	}

}
