package constructor;

public class ParaConstructor {
	
	private int length;
	private int breadth;
	private int height;
	
	
	
	public ParaConstructor(int length, int breadth, int height) {
		super();
		this.length = length;
		this.breadth = breadth;
		this.height = height;
		
		System.out.println(" Inside Parameterized Constructor");
		
		//calling the method
		areaOfRectangle(length, breadth, height);
	}

	static void areaOfRectangle(int l, int b, int h) {
		System.out.println("Inside Method");
		System.out.println("Area : "+(l*b*h));
	}


	public static void main(String[] args) {
		
		ParaConstructor p = new ParaConstructor(12,14,12);	
		
		System.out.println("Invoking the static method using the class");
		ParaConstructor.areaOfRectangle(11, 11, 11);
		
	}

}
