package Ex3;

public class SemaphoreMutex extends Thread{
	
	Contadora count;
	
	public SemaphoreMutex(Contadora count ) {
		
		this.count = count;
	}
	@Override
	public void run() {
		
		while(true) {
		System.out.print("Se prepara");
		System.out.println(count.incrementar());  
		}
	}

}
