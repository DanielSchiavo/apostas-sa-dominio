package com.apostassa.dominio.categoria;

import com.apostassa.dominio.categoria.subcategoria.SubCategoria;
import com.fasterxml.jackson.annotation.JsonInclude;
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
public class Categoria {
	
	private UUID id;

	private String nome;
	
	private String icone;
	
	private LocalDateTime dataEHoraCriacao;
	
	private UUID criadoPor;
	
	private LocalDateTime dataEHoraUltimaAlteracao;
	
	private UUID alteradorPor;
	
	private Long numeroApostas;
	
	private Long numeroEventos;
	
	private BigDecimal totalReaisMovimentado;
	
	private BigDecimal totalDolarMovimentado;
	
	private BigDecimal totalEuroMovimentado;
	
	private BigDecimal totalBitcoinMovimentado;
	
	private Boolean ativo;

	@Getter(value = AccessLevel.NONE)
	@Setter(value = AccessLevel.NONE)
	private List<SubCategoria> subCategorias = new ArrayList<>();

	public List<SubCategoria> getSubCategorias() {
		if (this.subCategorias == null) {
			this.subCategorias = new ArrayList<>();
		}
		return Collections.unmodifiableList(this.subCategorias);
	}

	public void adicionarSubCategoria(SubCategoria subCategoria) {

		this.subCategorias.add(subCategoria);
	}

	public void removerSubCategoria(SubCategoria subCategoria) {

		this.subCategorias.remove(subCategoria);
	}
	
}
