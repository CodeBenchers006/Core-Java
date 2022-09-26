package multithreading.runnable_interface;

class Class1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			System.out.println("Thread 1");
		}
	}
	
}

class Class2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			System.out.println("Thread 2");
		}
	}
	
}

public class ThreadDemo {
	
	public static void main(String[] args) {
		
		Class1 c1 = new Class1();
		Class2 c2 = new Class2();
		
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);
		
		t1.start();
		t2.start();
	}
	
	

}
