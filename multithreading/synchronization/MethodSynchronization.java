package multithreading.synchronization;

//Multithreading is a process where multiple threads run parallel, this leads to a problems
//when multiple threads try  to access the same resource which leads to wrong answer
//Synchronization is a process which allows only one thread to perform at a particular time

//Two ways to achieve synchronization
//1. Method level
//2. Block level

class BusReserve extends Thread{
	
	int available=1,passenger;
	
	public BusReserve(int passenger) {
		this.passenger = passenger;
	}
	
	//Method level synchronization
	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		String name = Thread.currentThread().getName().toString();
		
		if(available>=passenger) {
			System.out.println("Seat reserved for "+name);
			available-=passenger;
		}
		else
			System.out.println("Seats full");
		
		
	}
	
}



public class MethodSynchronization {
	
	public static void main(String[] args) {
		
		BusReserve b = new BusReserve(1);
		
		Thread t1 = new Thread(b);
		Thread t2 = new Thread(b);
		Thread t3 = new Thread(b);
		
		t1.setName("Albert");
		t2.setName("Edward");
		t3.setName("Richard");
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
