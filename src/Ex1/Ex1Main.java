package Ex1;

import java.util.concurrent.Semaphore;

/* 1. Sinalização
 * Enviar sinal para outra thread para indicar que um evento ocorreu.
Faça um código que uma thread t1 e t2 são inicializadas simultaneamente, 
mas a t2 pode somente continuar a execução após a sinalização de t1.
 * 
 * @maralucilg
 * 
 */

public class Ex1Main {

	public static void main(String[] args) {
		
		Semaphore semaphore = new Semaphore(0);
		
		new t1(semaphore).start();
		new t2(semaphore).start();

	}

}
