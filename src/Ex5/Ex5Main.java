package Ex5;

/*5. Barreira

Após n threads sincronizarem em um ponto em comum, um trecho específico
 (ponto crítico) pode ser executado por cada uma delas.Faça um código que possibilite barrar N 
 threads em um ponto específico de execução e, após todas alcançarem o ponto, todas devem executar
 o trecho de código após esse ponto.
 *
 * @maralucilg
*/


public class Ex5Main {
	
	private static final int N_THREADS = 3;

	public static void main(String[] args) {
		
		for (int i = 0; i < N_THREADS; i++ ) {
			
			new threadAlok().start();
		}
	}
	
	

}
