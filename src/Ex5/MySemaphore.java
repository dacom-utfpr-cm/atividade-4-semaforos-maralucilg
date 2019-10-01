package Ex5;

import java.util.concurrent.Semaphore;

public class MySemaphore {

	Semaphore barreira = new Semaphore(0);
	Semaphore barreira2 = new Semaphore(1); // mutex
	int n_threads = 0;

	public void pontocomum (int ponto) { 

		try {
		barreira2.acquire();
		
		n_threads++;
		barreira2.release();

		if (n_threads >= ponto) { // todo mundo chegou

			barreira.release();
			
		}

		barreira.acquire();
		barreira.release();
		
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}