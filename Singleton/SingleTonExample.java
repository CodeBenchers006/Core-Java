package Singleton;


//Class with only one instance/object of the class is called SingleTon Class
public class SingleTonExample {
	
	//Steps to create a singleton Class
	
	//Declare a private static data member which is the instance of the class
	private static SingleTonExample singleTonExample = null;
	
	//Declare a private constructor so that other classes can not create an object
	private SingleTonExample() {
		
	}
	
	//Create a method that returns the instance/object of the class
	public static SingleTonExample getInstance() {
		if(singleTonExample == null) {
			singleTonExample = new SingleTonExample();
		}
		return singleTonExample;
	}
	
	public static void main(String[] args) {
		
		SingleTonExample obj1 = SingleTonExample.getInstance();
		SingleTonExample obj2 = SingleTonExample.getInstance();
		
		System.out.println(obj1);
		System.out.println(obj2);
	}

}
