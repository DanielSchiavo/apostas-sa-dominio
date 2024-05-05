package com.apostassa.dominio.usuario;


import com.apostassa.dominio.ValidacaoException;
import com.apostassa.dominio.usuario.exceptions.AlterarUsuarioException;
import com.apostassa.dominio.usuario.exceptions.AutenticacaoException;
import com.apostassa.dominio.usuario.exceptions.UsuarioNaoEncontradoException;

import java.math.BigDecimal;

public interface RepositorioDeUsuarioUser {
	
	Usuario autenticarUsuario(Usuario usuario) throws AutenticacaoException, ValidacaoException;
	
	
	
	void cadastrarUsuario(Usuario usuario) throws ValidacaoException;
	
	
	
	Usuario pegarDadosDoUsuarioPaginaInicial(String usuarioId) throws ValidacaoException;
	
	Usuario pegarDadosDoUsuarioPessoais(String usuarioId) throws ValidacaoException;

	BigDecimal pegarSaldoPorUsuarioId(String usuarioId);



	void usuarioAlteraSeusDadosPessoais(Usuario usuario) throws AlterarUsuarioException;

	void usuarioAlteraSuaSenha(Usuario usuario) throws AlterarUsuarioException;



	boolean verificarSeUsuarioJaConfirmouIdentidade(String usuarioId) throws UsuarioNaoEncontradoException;


	void novoSaldo(BigDecimal novoSaldo);
}
