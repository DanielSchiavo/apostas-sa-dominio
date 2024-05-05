package com.apostassa.dominio.jogo;

import com.apostassa.dominio.jogo.mapa.MapaJogo;
import com.apostassa.dominio.jogo.role.RoleJogo;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Jogo {
	
	private UUID id;
	
	private String nome;
	
	private String icone;
	
	private String descricao;
	
	private String imagem;

	private LocalDateTime dataEHoraCriacao;

	private UUID criadoPor;

	private LocalDateTime dataEHoraUltimaAlteracao;

	private UUID alteradoPor;
	
	private Long numeroEventos;

	private Long numeroApostas;

	private BigDecimal totalReaisMovimentado;

	private BigDecimal totalDolarMovimentado;

	private BigDecimal totalEuroMovimentado;

	private BigDecimal totalBitcoinMovimentado;

	private Boolean ativo;

	private String subCategoriaId;

	@Getter(value = AccessLevel.NONE)
    @Setter(value = AccessLevel.NONE)
	private List<RoleJogo> roles;
	
	@Getter(value = AccessLevel.NONE)
    @Setter(value = AccessLevel.NONE)
	private List<MapaJogo> mapas;
	
	public List<RoleJogo> getRoles() {
		if (this.roles == null) {
			this.roles = new ArrayList<>();
		}
		return Collections.unmodifiableList(this.roles);
	}

	public void adicionarRole(RoleJogo role) {
		this.roles.add(role);
	}
	
	public void removerRole(RoleJogo role) {
		this.roles.remove(role);
	}

	public List<MapaJogo> getMapas() {
		if (this.mapas == null) {
			this.mapas = new ArrayList<>();
		}
		return Collections.unmodifiableList(this.mapas);
	}

	public void adicionarMapa(MapaJogo mapa) {
		this.mapas.add(mapa);
	}
	
	public void removerMapa(MapaJogo mapa) {
		this.mapas.remove(mapa);
	}
	
	
}
