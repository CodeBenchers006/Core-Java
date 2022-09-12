package access_modifier.package2_default;

class ClassA {
	
	//Accessible by other classes within the same package
	
	public ClassA() {
		System.out.println("Class with default access specifier");
	}

	int num = 10;
	
	void methodA() {
		System.out.println("Method with default access specifier");
	}

}
