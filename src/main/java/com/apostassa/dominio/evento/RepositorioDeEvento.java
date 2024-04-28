package com.apostassa.dominio.evento;

import java.util.List;
import java.util.UUID;

public interface RepositorioDeEvento {

	public Evento pegarEventoPorId(UUID id);

	public List<Evento> pegarTodosEventos();

	public List<Evento> pegarTodosEventosPorSubCategoriaId(String subCategoriaId);
}
