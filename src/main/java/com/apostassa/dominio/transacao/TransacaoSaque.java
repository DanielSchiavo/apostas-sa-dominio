package com.apostassa.dominio.transacao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public class TransacaoSaque {

	private UUID id;

	private String usuarioCpf;

	private BigDecimal valor;

	private LocalDateTime dataEHoraSolicitacao;

	private StatusTransacao status;

	private UUID moedaId;

	private BigDecimal saldoAtual;

	private LocalDateTime dataEHoraAprovacao;

	public TransacaoSaque() {
		this.id = UUID.randomUUID();
	}
}
