package Ex3;

import java.util.concurrent.Semaphore;

public class Contadora {
	
	Semaphore semaphore = new Semaphore(1);
	int count = 0;
	

	public int incrementar() {
		
		try {
			semaphore.acquire();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		count++;
		semaphore.release();
		return count;
	
		
		
		
	}

}
