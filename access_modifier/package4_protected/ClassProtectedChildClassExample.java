package access_modifier.package4_protected;

class ParentClass{
	
	protected void methodA() {
		System.out.println("Protected method");
	}
}

public class ClassProtectedChildClassExample extends ParentClass{
	
	protected void methodA() {
		System.out.println("Overriding protected method of parent class");
	}
	
	public static void main(String[] args) {
		ClassProtectedChildClassExample c = new ClassProtectedChildClassExample();
		c.methodA();
	}

}
