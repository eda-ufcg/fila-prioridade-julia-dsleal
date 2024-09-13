import java.util.ArrayList;

public class InsereFinalFilaPrioridade implements FilaPrioridade {

	private ArrayList<Pair> fila;

	public InsereFinalFilaPrioridade(int capacidade) {
		this.fila = new ArrayList<Pair>(capacidade);
	}
	
	// criar um Pair e adicionar no fim da fila
	public void add(String elemento, int prioridade) {
		Pair pair = new Pair(elemento, prioridade);

		fila.add(pair);
	}


	// buscar pelo elemento de maior prioridade na fila.
	public String removeNext() {
		int maior_prioridade_index = 0;

		for(int i = 0; i < fila.lenght; i++){
			if(fila.get(i).getPrioridade() > fila.get(maior_prioridade_index).getPrioridade()){
				maior_prioridade_index = i;
			}
		}

		return fila.remove(maior_prioridade_index).getElemento();
	}

}
