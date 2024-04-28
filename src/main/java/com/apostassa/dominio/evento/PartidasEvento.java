package com.apostassa.dominio.evento;

import com.apostassa.dominio.evento.estatisticas.lol.Estatisticas;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PartidasEvento {
	
	private UUID eventoId;
	
	private Short partidaNumero;
	
	private UUID mapaId;
	
	private EquipeEvento equipeEventoVencedora;
	
	private EquipeEvento equipeEventoPerdedora;
	
	private Estatisticas estatisticas;

}
