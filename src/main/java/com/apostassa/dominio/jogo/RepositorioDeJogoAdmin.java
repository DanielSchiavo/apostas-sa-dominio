package com.apostassa.dominio.jogo;

import com.apostassa.dominio.ValidacaoException;

import java.util.List;

public interface RepositorioDeJogoAdmin {

	public void cadastrarJogo(Jogo jogo) throws ValidacaoException;
	
	public void deletarJogo(String jogoId) throws ValidacaoException, DeletarJogoException;

	public void alterarJogo(Jogo jogo) throws AlterarJogoException;



	public Jogo pegarJogoPorId(String jogoId) throws ValidacaoException;

	public List<Jogo> pegarTodosJogos();



	public void verificarSeNomeJogoJaExiste(String nome) throws ValidacaoException;

	boolean verificarSeJogoExistePorId(String jogoId);
}
