package Ex7;

import java.util.concurrent.Semaphore;

public class MySemaphore {
	

	Semaphore semaphore = new Semaphore(0, true); // fair
	Semaphore barreira2 = new Semaphore(1); // mutex

	void justacquire() throws Exception {

		semaphore.acquire();
	}

	void justrelease() throws Exception {

		semaphore.release();
	}
}


