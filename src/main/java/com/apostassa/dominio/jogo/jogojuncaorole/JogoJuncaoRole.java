package com.apostassa.dominio.jogo.jogojuncaorole;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class JogoJuncaoRole {

    private String jogoId;

    private String roleJogoId;

    private LocalDateTime dataEHoraAtribuicao;

    private String atribuidoPor;
}
