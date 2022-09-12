package access_modifier.package2_default;

import access_modifier.package1_public.Class1;

public class MainClass {
	
	public static void main(String[] args) {
		ClassA a= new ClassA();
		a.methodA();
		
		//Trying to access public class of different package
		//We can access public class belonging to different package
		Class1 c = new Class1();
	}

}
