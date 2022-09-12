package keywords;


//This keyword is used to refer the instance variable

public class ThisExample {

	private String fruit;
	private int quantity;
	
	public ThisExample(String fruit, int quantity) {
		super();
		this.fruit = fruit;
		this.quantity = quantity;
	}
	
	void methodA()
	{
		
		System.out.println("I want to buy "+fruit+" of "+quantity+ " kgs");
	}
	
	public static void main(String[] args) {
		ThisExample var = new ThisExample("Apple", 2);
		var.methodA();
	}
}
