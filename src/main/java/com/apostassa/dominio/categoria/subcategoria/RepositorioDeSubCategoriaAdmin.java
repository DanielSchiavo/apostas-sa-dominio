package com.apostassa.dominio.categoria.subcategoria;

import com.apostassa.dominio.ValidacaoException;

import java.util.List;

public interface RepositorioDeSubCategoriaAdmin {

	public void cadastrarSubCategoria(SubCategoria subCategoria) throws ValidacaoException;

	public void alterarSubCategoria(SubCategoria subCategoria) throws AlterarSubCategoriaException, ValidacaoException;

	public void deletarSubCategoria(String subCategoriaId) throws DeletarSubCategoriaException, ValidacaoException;

	public void verificarSeNomeSubCategoriaJaExiste(String nome) throws ValidacaoException;


	public SubCategoria pegarSubCategoriaPorId(String subCategoriaId) throws ValidacaoException;

	public List<SubCategoria> pegarTodasSubCategorias() throws ValidacaoException;

	public List<SubCategoria> pegarTodasSubCategoriasPorCategoriaId(String string);



	public void commitarTransacao();

	public void rollbackTransacao();


}
