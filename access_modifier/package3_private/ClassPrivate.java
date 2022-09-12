package access_modifier.package3_private;

public class ClassPrivate {
	
	
	
	public ClassPrivate() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Member of this class are private, so they are accessible "
				+ "only via same class");
	}

	private int id=10;
	
	private void methodA() {
		System.out.println("Private method");
	}

}
