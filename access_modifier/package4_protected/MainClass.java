package access_modifier.package4_protected;

public class MainClass {

	public static void main(String[] args) {
		ClassProtected p = new ClassProtected();
		System.out.println(p.id);
		p.methodA();
	}
}
