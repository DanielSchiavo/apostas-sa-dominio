package com.apostassa.dominio.usuario;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RoleUsuario {
	
	private UUID usuarioId;
	
	private LocalDateTime dataAtribuicao;
	
	private NomeRole role;

}
