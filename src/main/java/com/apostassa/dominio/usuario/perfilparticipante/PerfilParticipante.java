package com.apostassa.dominio.usuario.perfilparticipante;

import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PerfilParticipante {

	private UUID usuarioId;

	private String foto;
	
	private String instagram;
	
	private String facebook;
	
	private String twitter;
	
	private String frase;

	private LocalDateTime dataCriacao;

	private Boolean ativo;
	
}
