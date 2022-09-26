package multithreading.thread_class;

class ClassA extends Thread{

	@Override
	public void run() {
		System.out.println("Thread 1");
	}
		
}

class ClassB extends Thread{

	@Override
	public void run() {
		System.out.println("Thread 2");
	}
		
}


public class MyClass {
	
	public static void main(String[] args) {
		
		ClassA t1 = new ClassA();
		ClassB t2 = new ClassB();
		
		t1.start();
		t2.start();
		
	}

}
