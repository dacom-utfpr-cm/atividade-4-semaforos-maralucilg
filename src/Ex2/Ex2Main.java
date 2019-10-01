package Ex2;

import java.util.concurrent.Semaphore;

/*
2. Rendezvous (Encontro)

Enviar sinalização para um ponto de encontro entre threads.Faça um código que uma thread t1 e t2 são inicializadas e t1 espera por t2 e vice-versa.

Exemplo:
t1:
- trecho1.1
- trecho1.2

t2:
- trecho2.1
- trecho2.2

thecho1.1 ocorre antes trecho2.2 e threcho2.1 ocorre antes de trecho1.2.
*	
* @maralucilg
*/

public class Ex2Main {
	
	public static void main(String[] args) {

		Semaphore semaphore = new Semaphore(0);
		Semaphore semaphore2 = new Semaphore(0);

		new Thread1(semaphore, semaphore2).start();
		new Thread2(semaphore, semaphore2).start();
		
	}


}
