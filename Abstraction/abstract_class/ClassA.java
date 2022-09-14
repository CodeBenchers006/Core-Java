package Abstraction.abstract_class;

//Abstraction can be achieved by using abstract keyword

//An abstract class can have both abstract and non abstract methods

//Abstract class provides partial abstraction
public abstract class ClassA {
	
	abstract void draw();
	
	public void shape() {
		System.out.println("Non abstract method inside abstract class");
	}

}
