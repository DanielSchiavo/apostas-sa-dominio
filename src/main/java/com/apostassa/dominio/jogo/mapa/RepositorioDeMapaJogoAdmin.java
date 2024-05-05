package com.apostassa.dominio.jogo.mapa;

import com.apostassa.dominio.ValidacaoException;

import java.util.List;

public interface RepositorioDeMapaJogoAdmin {

    public void cadastrarMapaJogo(MapaJogo mapaJogo) throws ValidacaoException;

    public void alterarMapaJogo(MapaJogo mapaJogo) throws AlterarMapaJogoException;

    public void deletarMapaJogo(String mapaJogoId) throws DeletarMapaJogoException;

    public MapaJogo pegarMapaJogoPorId(String mapaJogoId) throws ValidacaoException;

    public List<MapaJogo> pegarTodosMapasJogoPorJogoId(String jogoId);

    public boolean verificarSeNomeMapaJogoJaExiste(String nomeRoleJogo) throws ValidacaoException;

}
