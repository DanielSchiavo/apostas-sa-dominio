package com.apostassa.dominio.categoria;


import com.apostassa.dominio.ValidacaoException;

import java.util.List;

public interface RepositorioDeCategoriaAdmin {
	
	public void cadastrarCategoria(Categoria categoria) throws ValidacaoException;

	public void alterarCategoria(Categoria categoria) throws AlterarCategoriaException, ValidacaoException;

	public void removerCategoria(Categoria categoria) throws RemoverCategoriaException;

	public void verificarSeNomeCategoriaJaExiste(String nome) throws ValidacaoException;


	public Categoria pegarCategoriaPorId(String categoriaId) throws ValidacaoException;

	public List<Categoria> pegarTodasCategorias();


	public void commitarTransacao();

	public void rollbackTransacao();



}
