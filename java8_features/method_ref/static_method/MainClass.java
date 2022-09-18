package java8_features.method_ref.static_method;



//Method Reference for class with Static method -- Interface = ClassName :: method
public class MainClass {
	
	public static void main(String[] args) {
		
		MyInterface m = StaticDemo :: doTask;
		m.doTask();
	}

}
