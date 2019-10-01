package Ex4;

import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadMultiplex extends Thread {
	
	Semaphore semaphore = new Semaphore(3);
	Random r = new Random();
	AtomicInteger num_threads = new AtomicInteger(0);
	
	
	public void run() {
		
		try {
			semaphore.acquire();
			System.out.print(num_threads.incrementAndGet() + "se prepara");
			Thread.sleep(r.nextInt(10000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		finally {
		num_threads.decrementAndGet();
		semaphore.release();
		System.out.println("...tchau");
		}
		
	}

}
