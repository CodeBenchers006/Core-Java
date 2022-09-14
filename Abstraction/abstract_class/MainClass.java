package Abstraction.abstract_class;

//Abstraction by abstract class can be achieved using inheritance
public class MainClass extends ClassA{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Implementing abstract method of abstract class");
	}
	
	public static void main(String[] args) {
		
		//In abstraction we create object of parent class
		//Parent p = new Child();
		
		
		ClassA a= new MainClass();
		a.draw();
		a.shape();
	}

}
