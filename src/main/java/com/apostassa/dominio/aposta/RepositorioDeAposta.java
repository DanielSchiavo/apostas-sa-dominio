package com.apostassa.dominio.aposta;

import com.apostassa.dominio.equipe.Equipe;
import com.apostassa.dominio.evento.Evento;

import java.math.BigDecimal;
import java.util.List;


public interface RepositorioDeAposta {
	
	public void fazerAposta(Evento evento, Equipe equipeApostada, TipoAposta tipoAposta, BigDecimal valorApostado);

	public List<Aposta> buscarTodasApostasPorClienteId(String id);

	public Aposta buscarApostaPorApostaIdEClienteId(String apostaId, String clienteId);

}
