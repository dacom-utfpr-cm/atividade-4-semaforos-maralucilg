package Ex5;

import java.util.Random;

public class threadAlok extends Thread {
	

	MySemaphore semaphore = new MySemaphore();
	Random r = new Random();

	@Override
	public void run() {
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
