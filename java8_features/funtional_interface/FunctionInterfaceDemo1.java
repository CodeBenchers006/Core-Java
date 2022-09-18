package java8_features.funtional_interface;

//Java8 brings a new feature called Functional Interface

//An interface with only one abstract method is called Functional Interface

//We can also have non-abstract methods

//Functional Interfaces are implemented using Lambda Expressions (Anonymous Functions)


@FunctionalInterface
interface MyInterface{
	
	void helloWorld();
	
}


public class FunctionInterfaceDemo1 {
	
	public static void main(String[] args) {
		
		
		MyInterface m = ()-> System.out.println("Hello Wolld"); //Lambda Expression () -> { //statement };
		m.helloWorld();
	}
}
