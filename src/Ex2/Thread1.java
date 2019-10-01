package Ex2;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class Thread1 extends Thread {
	
	Semaphore semaphore;
	Semaphore semaphore2;
	Random r = new Random();

	public Thread1(Semaphore s1, Semaphore s2 ) {

		this.semaphore = s1;
		this.semaphore2 = s2;
	}
	@Override
	public void run() {


		try {
			System.out.println("T1 >> P1 >> Oi");
			Thread.sleep(r.nextInt(10000));
			semaphore2.release();
			semaphore.acquire();
			System.out.println("T1 >> P1 >> Oi de novo");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
