package access_modifier.package1_public;

public class MainClass {
	
	public static void main(String[] args) {
		Class1 c = new Class1();
		c.method1();
		System.out.println(c.id);
		
		//Trying to access default class from different package
		//ClassA a = new ClassA();
		
	}

}
