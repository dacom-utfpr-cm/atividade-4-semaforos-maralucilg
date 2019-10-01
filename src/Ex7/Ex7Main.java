package Ex7;

/*
7. Fila

Semáforos podem ser usadas para representar uma fila.Faça um código que implemente duas filas (F1 e F2) 
com semáforos. As threads colocadas na F1 sópodem executar se tiver um par na F2. 
Nesse caso, ambas as threads na primeira fila são executadas.
*
* @maralucilg
*/

public class Ex7Main {
	
	private static final int N = 5;

	public static void main(String[] args) {
	MySemaphore f1 = new MySemaphore();
	MySemaphore f2 = new MySemaphore();

	for(int i = 0; i < N; i++) {
	new ThreadFila(f1, f2).start();
	new ThreadFila(f2, f1).start();
	}

}
}
