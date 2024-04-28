package com.apostassa.dominio.usuario.perfiljogador.perfiljogo;

import com.apostassa.dominio.equipe.JogoEquipe;
import com.apostassa.dominio.jogo.Jogo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PerfilJogo {

	private UUID usuarioId;
	
	private Jogo jogo;
	
	private String nomeNoJogo;
	
	private JogoEquipe jogoEquipe;
	
}
