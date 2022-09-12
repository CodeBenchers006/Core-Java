package constructor;

public class DefConstructor {
	
	void method1() {
		System.out.println("This method will be invoked using default constructor");
	}
	
	public static void main(String[] args) {
		
		DefConstructor con = new DefConstructor();
		con.method1();
		
	}

}
