package keywords;

//Parent Class
class ParentClass {
	int id = 101;
	String name = "CodeBenchers006";
	
	public ParentClass() {
		System.out.println("Parent Constructor");
	}
	
}

public class SuperExample extends ParentClass{
	
	int id=102;
	
	public SuperExample() {
		
		System.out.println("Child Constructor");
	}
	
	void methodA() {
		System.out.println("Child id :"+id);
		System.out.println("Parent id :"+super.id);
		
		//The super keyword is used to refer immediate parent class object, variable.
		//It is used to pull the info/data of parent class
	}

	public static void main(String[] args) {
		SuperExample s = new SuperExample();
		s.methodA();
	}
	

}
