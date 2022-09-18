package java8_features.funtional_interface;

@FunctionalInterface
interface myInterface1{
	
	void studentDetails(int stdId, String stdName, int marks, int subjects);
	
}


public class FuntionalInterfaceDemo2 {
	
	public static void main(String[] args) {
		
		myInterface1 m = (stdId,stdName,marks,subjects)->{
			float percentage = marks/subjects;
			System.out.println("Student Id:"+stdId);
			System.out.println("Student Name:"+stdName);
			System.out.println("Percentage:"+percentage);
			};
			
		m.studentDetails(101, "Aditya Sharma", 408, 5);
	}
	
	

}
