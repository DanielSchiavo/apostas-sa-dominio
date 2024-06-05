package com.apostassa.dominio.usuario;

import com.apostassa.dominio.ValidacaoException;
import com.apostassa.dominio.aposta.Aposta;
import com.apostassa.dominio.transacao.TransacaoSaque;
import com.apostassa.dominio.usuario.perfilparticipante.PerfilParticipante;
import com.apostassa.dominio.usuario.perfilparticipante.perfiljogo.PerfilJogo;
import com.apostassa.dominio.usuario.validation.IdadeMinima;
import com.apostassa.dominio.usuario.validation.RegrasComumDeValidacao;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(value = Include.NON_NULL)
@Builder
public class Usuario {
	
	@org.hibernate.validator.constraints.br.CPF
	private String cpf;

	private RG rg;
	
	private String imagemComprovanteIdentidadeFrente;
	
	private String imagemComprovanteIdentidadeVerso;

	private String nome;
	
	private String sobrenome;

	@jakarta.validation.constraints.Email
	private String email;

	private Celular celular;

	@Size(min = RegrasComumDeValidacao.MIN_PASSWORD_LENGTH, message = RegrasComumDeValidacao.MESSAGE_MIN_PASSWORD_LENGTH)
	private String senha;

	@IdadeMinima(value = RegrasComumDeValidacao.IDADE_MINIMA)
	private LocalDate dataNascimento;
	
	private LocalDateTime dataCriacaoConta;
	
	private BigDecimal saldo;
	
	private Boolean confirmouIdentidade;
	
	private PerfilParticipante perfilJogador;
	
	@Getter(value = AccessLevel.NONE)
    @Setter(value = AccessLevel.NONE)
	@Singular
	private List<Aposta> apostas = new ArrayList<>();
	
	@Getter(value = AccessLevel.NONE)
    @Setter(value = AccessLevel.NONE)
	@Singular
	private List<TransacaoSaque> transacoes = new ArrayList<>();
	
	@Getter(value = AccessLevel.NONE)
    @Setter(value = AccessLevel.NONE)
	@Singular
	private List<PerfilJogo> perfisJogos = new ArrayList<>();
	
    @Getter(value = AccessLevel.NONE)
    @Setter(value = AccessLevel.NONE)
	@Singular
	private Set<RoleUsuario> roles = new HashSet<>();

	public List<Aposta> getApostas() {
		return Collections.unmodifiableList(this.apostas);
	}
	
	public void adicionarAposta(Aposta aposta) {
		this.apostas.add(aposta);
	}

	public List<TransacaoSaque> getTransacoes() {
		return Collections.unmodifiableList(this.transacoes);
	}
	
	public void adicionarTransacao(TransacaoSaque transacao) {
		this.transacoes.add(transacao);
	}

	public List<PerfilJogo> getPerfisJogos() {
		return Collections.unmodifiableList(this.perfisJogos);
	}

	public void adicionarPerfilJogo(PerfilJogo perfilJogo) {
		this.perfisJogos.add(perfilJogo);
	}

	public Set<RoleUsuario> getRoles() {
		return Collections.unmodifiableSet(this.roles);
	}

	public void adicionarRole(RoleUsuario role) {
		this.roles.add(role);
	}

	public void removerRole(RoleUsuario role) {
		this.roles.remove(role);
	}

	private void validate() throws ValidacaoException {
		Set<ConstraintViolation<Usuario>> violations = Validation.buildDefaultValidatorFactory().getValidator().validate(this);
		if (!violations.isEmpty()) {
			StringBuilder sb = new StringBuilder();
			for (ConstraintViolation<Usuario> violation : violations) {
				sb.append(violation.getMessage()).append("\n");
			}
			throw new ValidacaoException(sb.toString());
		}
	}

	public static UsuarioBuilder builder() {
		return new UsuarioBuilder() {
			@Override
			public Usuario build() {
				Usuario usuario = super.build();
				usuario.validate();
				return usuario;
			}
		};
	}

}
