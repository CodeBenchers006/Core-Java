package java8_features.method_ref.cons;

@FunctionalInterface
interface CustomInterface{
	
	void refConstructor();
}

class RefConstructor{
	
	public RefConstructor() {
		System.out.println("Method Reference for Constructor");
	}
}


//Method reference for a constructor -> FunctionalInterface = ClassName :: new

public class MainClass {
	public static void main(String[] args) {
		CustomInterface c = RefConstructor::new;
		c.refConstructor();
	}

}
