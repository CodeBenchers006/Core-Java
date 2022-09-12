package constructor;

public class ConsChaining {
	
	private int id;
	private String name;
	
	public ConsChaining(){
		this(101);
		System.out.println("Default Constructor");
	}
	
	public ConsChaining(int id){
		this(id,"Ronald");
		System.out.println("Para constructor with id parameter");
	}

	public ConsChaining(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("Para constructor with id and name");
		System.out.println(id);
		System.out.println(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConsChaining c = new ConsChaining();
	}

}
