package controller;
import model.PilhaInt;

public class PilhaInteiros {

	public PilhaInteiros() {
		super();
	}
	
	PilhaInt pilha = new PilhaInt();
	
	public PilhaInt algoritmo (PilhaInt pilha) throws Exception {
		
		
		for (int i = 0; i <= 16; i++) {
			if (i >= 0) {
				pilha.push(i);
			}
			else {
				int aux1 = pilha.pop();
				int aux2 = pilha.pop();
				
				int soma = aux1 + aux2;
				
				pilha.push(i);
				pilha.push(soma);
			}
			
		}
		
		int tamanho = pilha.size();

		System.out.println("O tamanho é " + tamanho);
		System.out.println("========================");
		System.out.println(pilha);
		
		return pilha;
		
}

}
