package view;
import controller.PilhaInteiros;
import model.PilhaInt;

public class Principal {

	public static void main(String[] args) throws Exception {
		PilhaInt pilha = new PilhaInt();
		PilhaInteiros pilhaint = new PilhaInteiros();
		
		pilha.push(0);
		pilha.push(5);
		pilha.push(7);
		pilha.push(-4);
		pilha.push(3);
		pilha.push(5);
		pilha.push(-2);
		pilha.push(-1);
		pilha.push(10);
		pilha.push(4);
		pilha.push(3);
		pilha.push(-6);
		pilha.push(2);
		pilha.push(-9);
		pilha.push(1);
		pilha.push(-5);
		
	}
}