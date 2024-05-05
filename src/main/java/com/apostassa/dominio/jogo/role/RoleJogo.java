package com.apostassa.dominio.jogo.role;

import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoleJogo {

	private UUID id;
	
	private String nome;
	
	private String descricao;
	
	private String icone;

	private LocalDateTime dataEHoraCriacao;

	private UUID criadoPor;

	private LocalDateTime dataEHoraUltimaAlteracao;

	private UUID alteradoPor;

	private Boolean ativo;

}
