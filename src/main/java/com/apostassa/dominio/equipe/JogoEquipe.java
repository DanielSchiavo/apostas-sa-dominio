package com.apostassa.dominio.equipe;

import com.apostassa.dominio.jogo.Jogo;
import com.apostassa.dominio.usuario.perfilparticipante.perfiljogo.PerfilJogo;
import lombok.*;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JogoEquipe {
	
	private UUID id;
	
	private UUID equipeId;
	
	private Jogo jogo;
	
	private Integer vitorias;
	
	private Integer empates;
	
	private Integer derrotas;
	
	@Getter(value = AccessLevel.NONE)
	@Setter(value = AccessLevel.NONE)
	private List<PerfilJogo> jogadores;

	public List<PerfilJogo> getJogadores() {
		return Collections.unmodifiableList(jogadores);
	}

	public void adicionarJogador(PerfilJogo jogador) {
		this.jogadores.add(jogador);
	}
	
	public void removerJogador(PerfilJogo jogador) {
		this.jogadores.remove(jogador);
	}
	
}
