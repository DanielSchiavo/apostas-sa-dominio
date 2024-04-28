package com.apostassa.dominio.jogo;

public interface RepositorioDeJogo {
	
	Jogo cadastrarJogo(Jogo jogo);
	
	void removerJogoPorJogoId(String jogoId);
}
