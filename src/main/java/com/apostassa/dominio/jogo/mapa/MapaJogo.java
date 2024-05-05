package com.apostassa.dominio.jogo.mapa;

import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MapaJogo {
	
	private UUID id;
	
	private String nome;
	
	private String imagem;
	
	private UUID jogoId;

	private LocalDateTime dataEHoraCriacao;

	private UUID criadoPor;

	private LocalDateTime dataEHoraUltimaAlteracao;

	private UUID alteradoPor;

	private Boolean ativo;
}
