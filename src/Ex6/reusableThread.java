package Ex6;

import java.util.Random;

public class reusableThread extends Thread {
	
	private static final int N_THREADS = 3;
	MySemaphore semaphore = new MySemaphore();
	Random r = new Random();

	@Override
	public void run() {

		for (int i = 0; i < N_THREADS; i++) {


		try {
			System.out.println("If you get hear me now");
			Thread.sleep(r.nextInt(10000));
			System.out.println("tunz tunz");
			semaphore.pontocomum(3);
			System.out.println("All the fear will get away");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

			
		}
	}

}
