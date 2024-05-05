package com.apostassa.dominio.transacao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TransacaoApostaGanha {

	private UUID usuarioId;

	private UUID apostaId;

	private BigDecimal valor;

	private LocalDateTime dataEHoraSolicitacao;

	private StatusTransacao status;

	private UUID moedaId;

	private BigDecimal saldoAtual;

	private LocalDateTime dataEHoraAprovacao;
}
