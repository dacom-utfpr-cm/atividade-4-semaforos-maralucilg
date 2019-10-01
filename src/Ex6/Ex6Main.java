package Ex6;

/*
6. Barreira Reusável

Threads em um laço executam uma série de passos e sincronizam em uma barreira a cada passo.
Faça um código que implemente uma barreira reusável que feche a si própria após todas as threads passarem.
*
* @maralucilg
*/

public class Ex6Main {
	
	public static void main(String[] args) {
		
		new reusableThread().start();
	}


}
