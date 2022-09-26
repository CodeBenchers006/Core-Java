package multithreading.more_thread_concepts;

/*
 * Job Scheduler is a part of processor that runs multiple threads on a single processor randomly
 */


class MyThread extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String n = Thread.currentThread().getName();
		for(int i=1;i<=5;i++) {
			System.out.println(n);
		}
	}
	
}

public class ThreadSchedulerDemo {
	
	public static void main(String[] args) {
		
		//We create 3 threads and let the scheduler decide which one to execute first
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();
		
		t1.setName("Thread 1");
		t2.setName("Thread 2");
		t3.setName("Thread 3");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
