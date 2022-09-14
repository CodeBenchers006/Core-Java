package exception_handling.custom;

public class MainClass {
	
	boolean eligibleToVote(int age) throws MyException{
		
		boolean flag = false;
		if(age<18) {
			throw new MyException("age cannot be less than 18");
		}
		else
			flag=true;
		
		return flag;
		
	}
	
	public static void main(String[] args) throws MyException {
		MainClass m = new MainClass();
		System.out.println(m.eligibleToVote(17));
		
	}

}
