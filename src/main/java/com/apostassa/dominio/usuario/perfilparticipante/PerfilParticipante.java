package com.apostassa.dominio.usuario.perfilparticipante;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PerfilParticipante {

	private String usuarioCpf;

	private String foto;
	
	private String instagram;
	
	private String facebook;
	
	private String twitter;
	
	private String frase;

	private LocalDateTime dataCriacao;

	private Boolean ativo;
	
}
