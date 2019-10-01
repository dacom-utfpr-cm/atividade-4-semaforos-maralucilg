package Ex1;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class t2 extends Thread {
	
	Semaphore semaphore;
	Random r = new Random();
	
	public t2(Semaphore semaphore) {
		
		this.semaphore = semaphore;
	}
	
	@Override
	public void run() {

		try {
			semaphore.acquire();
			System.out.println("cheguei...");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	

}
