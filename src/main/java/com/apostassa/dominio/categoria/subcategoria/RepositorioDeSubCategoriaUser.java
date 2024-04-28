package com.apostassa.dominio.categoria.subcategoria;

import com.apostassa.dominio.ValidacaoException;

import java.util.List;

public interface RepositorioDeSubCategoriaUser {

	public SubCategoria pegarSubCategoriaPorId(String subCategoriaId) throws ValidacaoException;

	public List<SubCategoria> pegarTodasSubCategorias() throws ValidacaoException;

	public List<SubCategoria> pegarTodasSubCategoriasPorCategoriaId(String string);



	public void commitarTransacao();

	public void rollbackTransacao();


}
