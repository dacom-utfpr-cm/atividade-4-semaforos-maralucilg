package Ex4;

/* 4. Multiplex
 * Garantir acesso à seção crítica para no máximo N threads.
 * Faça um código que possibilite que N threads estejam na seção crítica simultaneamente.
 * 
 * @maralucilg
 */

public class Ex4Main {

	private static final int N_THREADS = 5;

	public static void main(String[] args) {
		
		
		for(int i = 0; i < N_THREADS; i++) {
			new ThreadMultiplex().start();
		}
		
	}

}
