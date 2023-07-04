package br.com.brizzisoft.calc.modelo;

@FunctionalInterface
public interface MemoriaObservador {

	//Todo metodo da interface já é publico por natureza, não precisa deixar explicito
	void valorAlterado(String novoValor);
}
