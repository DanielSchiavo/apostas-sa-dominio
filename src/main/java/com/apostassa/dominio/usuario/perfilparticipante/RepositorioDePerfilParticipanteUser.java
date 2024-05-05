package com.apostassa.dominio.usuario.perfilparticipante;

import com.apostassa.dominio.ValidacaoException;

import java.time.LocalDateTime;

public interface RepositorioDePerfilParticipanteUser {

    void criarPerfilParticipante(String usuarioId, LocalDateTime dataCriacao, boolean ativo) throws ValidacaoException;

    void alterarPerfilParticipante(PerfilParticipante perfilParticipante) throws AlterarPerfilParticipanteException;

    PerfilParticipante pegarDadosPerfilParticipante(String usuarioId) throws ValidacaoException;
}
