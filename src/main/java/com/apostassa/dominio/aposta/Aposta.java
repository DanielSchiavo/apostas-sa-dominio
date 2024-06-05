package com.apostassa.dominio.aposta;

import com.apostassa.dominio.evento.Evento;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class Aposta {

	private UUID id;
	
	private String usuarioCpf;
	
	private Evento evento;
	
	private UUID equipeEventoApostadaId;
	
	private TipoAposta tipoAposta;
	
	private BigDecimal valorApostado;
	
	private BigDecimal chancesNoMomentoDaAposta;
	
	private BigDecimal chancesNoEncerramentoDaAposta;
	
	private StatusAposta status;
	
	private LocalDateTime dataEHora;

	public Aposta() {
		this.id = UUID.randomUUID();
	}
}
