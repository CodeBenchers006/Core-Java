package access_modifier.package4_protected;

public class ClassProtected {
	
	
	
	public ClassProtected() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("This is a class with protected members, which are accessible "
				+ "by other classes within the same package and subclasses");
	}

	protected int id = 10;
	
	protected void methodA() {
		System.out.println("Inside Protected method");
	}
	

}
