package com.apostassa.dominio.categoria.subcategoria;

import com.apostassa.dominio.categoria.Categoria;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SubCategoria {

	private UUID id;
	
	private String nome;
	
	private String icone;
	
	private LocalDateTime dataCriacao;
	
	private UUID criadoPor;
	
	private LocalDateTime dataUltimaAlteracao;
	
	private UUID alteradorPor;
	
	private Long numeroApostas;
	
	private Long numeroEventos;
	
	private BigDecimal totalReaisMovimentado;
	
	private BigDecimal totalDolarMovimentado;
	
	private BigDecimal totalEuroMovimentado;
	
	private BigDecimal totalBitcoinMovimentado;
	
	private Boolean ativo;
	
	private Categoria categoria;
}
