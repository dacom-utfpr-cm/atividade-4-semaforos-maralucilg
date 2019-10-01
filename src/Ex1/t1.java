package Ex1;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class t1 extends Thread {
	
	Semaphore semaphore;
	Random r = new Random();
	
	public t1(Semaphore semaphore) {
		
		this.semaphore = semaphore;
	}
	
	@Override
	public void run() {

		try {
			System.out.println("se prepara...");
			Thread.sleep(r.nextInt(1000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		finally {
			semaphore.release();
		}
	}
	
	

}
