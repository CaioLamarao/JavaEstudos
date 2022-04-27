package application;

public class Metodo {
	
	public Integer pesquisaBinaria(int[] Lista, int item) {
		int baixo = 0; 
		int alto = Lista.length-1; //Delimita��o da lista que ser� pesquisada
		
		while (baixo <= alto) {
			int meio = (baixo+alto)/2; 
			int chute = Lista[meio]; //Verifica o elemento central e divide a lista em 2
			
			if(chute == item) {
				return meio;
			}
			if(chute > item) {
				alto = meio - 1; //O chute foi muito alto
			} else {
				baixo = meio + 1;  // O chute foi muito baixo
			}
		}
		return null;
	}

}
