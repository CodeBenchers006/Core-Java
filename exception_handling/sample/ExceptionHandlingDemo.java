package exception_handling.sample;

public class ExceptionHandlingDemo {
	
	int methodA(int n1,int n2) throws Exception{
		int div=0;
		if(n2 == 0)
			throw new ArithmeticException("Denominator cannot be zero");
		else
			div = n1/n2;
		
		return div;
	}
	
	public static void main(String[] args) {
		ExceptionHandlingDemo ex = new ExceptionHandlingDemo();
		try {
			System.out.println(ex.methodA(12, 3));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
