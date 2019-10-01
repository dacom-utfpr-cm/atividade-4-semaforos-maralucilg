package Ex2;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class Thread2 extends Thread {
	
	Semaphore semaphore;
	Semaphore semaphore2;
	Random r = new Random();

	public Thread2(Semaphore s1, Semaphore s2 ) {

		this.semaphore = s1;
		this.semaphore2 = s2;
	}

	@Override
	public void run() {


		try {
			System.out.println("T2 >> P2 >> Oi");
			Thread.sleep(r.nextInt(10000));
			semaphore.release();
			semaphore2.acquire();
			System.out.println("T1 >> P2 >> Oi de novo");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	


	}

}
