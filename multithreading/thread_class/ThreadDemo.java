package multithreading.thread_class;

class Class1 extends Thread{
	
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Thread 1");
		}
		
//		try {
//			Thread.sleep(5000);
//		}
//		catch (Exception e) {
//			System.out.println(e);
//		}
	}
	
}

class Class2 extends Thread{
	
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Thread 2");
		}
		
//		try {
//			Thread.sleep(5000);
//		}
//		catch (Exception e) {
//			System.out.println(e);
//		}
	}
	
}



public class ThreadDemo {

	public static void main(String[] args) {
		Class1 c1 = new Class1();
		Class2 c2 = new Class2();
		
		c1.start();
		c2.start();
	}

}
