package Abstraction.interface_example;

//class -> implements -> interface
//interface -> extends -> interface

public class MainClassInterface implements ClassInterface{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Inside draw abstract method");
	}

	@Override
	public void shape() {
		// TODO Auto-generated method stub
		System.out.println("Inside shape abstract method");
	}
	
	public static void main(String[] args) {
		ClassInterface c = new MainClassInterface();
		c.draw();
		c.shape();
	}

}
