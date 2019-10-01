package Ex7;

public class ThreadFila extends Thread {
	
	MySemaphore fila1;
	MySemaphore fila2;

	public ThreadFila(MySemaphore f1, MySemaphore f2) {
		
		this.fila1 = f1;
		this.fila2 = f2;


		}
	@Override
	public void run() {
		try {
		System.out.println("Se prepara");
			fila2.justrelease();
			fila1.justacquire();
		System.out.println("tchau...");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	}


