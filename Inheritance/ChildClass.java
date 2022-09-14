package Inheritance;

public class ChildClass extends ParentClass{

	
	public ChildClass() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Child class");
	}
	
	
	public static void main(String[] args) {
		ChildClass c = new ChildClass();
		c.parent();
	}
	
}
