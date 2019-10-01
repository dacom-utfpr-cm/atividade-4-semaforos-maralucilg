package Ex3;

/*
 * 
  3. Mutex (Exclusão Mútua)

Garantir acesso exclusivo à seção crítica.Faça um código que possibilite que 2 ou mais threads
 realizem o incremento de um contador. Faça aexclusão mútua com semáforo.
 *
 * @maralucilg
 */

public class Ex3Main {
	
	private static final int NUM_THREADS = 3;

	public static void main(String[] args) {
	
	Contadora co = new Contadora();
	
	for(int i = 0; i < NUM_THREADS; i++) {
		
	new SemaphoreMutex(co).start();
	
	}

}
}