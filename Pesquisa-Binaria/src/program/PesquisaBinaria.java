package program;

import application.Metodo;

public class PesquisaBinaria {
	
	public static void main(String[] args) {
		
		Metodo  metodo = new Metodo();
		
		int [] lista = {1, 3, 5, 7, 9};
		System.out.println("Posição do número 3 na lista: " + metodo.pesquisaBinaria(lista, 3));
		System.out.println("Posição do número -1 na lista: " + metodo.pesquisaBinaria(lista, -1));

	}
	

}
