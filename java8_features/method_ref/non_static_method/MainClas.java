package java8_features.method_ref.non_static_method;

@FunctionalInterface
interface MyCustomInterface{
	void doSomething();
}


//Method reference for a class with non static method -> 
// 1. Create the object of the class with non static method
// 2. Follow the syntax --> Interface i = object :: method

public class MainClas {
	
	public static void main(String[] args) {
		
		NonStaticClass c = new NonStaticClass();
		
		MyCustomInterface m = c::action;
		
		m.doSomething();
	}
	
	

}
