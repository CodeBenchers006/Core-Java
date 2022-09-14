package exception_handling.custom;

public class MyException extends Exception{

	public MyException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
		System.out.println(this.getMessage());
	}
	
	

}
