package com.itau.carambola_lyra.bemAgricola.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_pessoa")
public class PessoaEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigoPessoa;
	
	@NotNull
	private String nome;
	
	@NotNull
	@Size (max = 11)
	private String cpf;
	
	@NotNull
	@Email
	private String email;
	
	@NotNull
	@Size (max = 9)
	private String telefone;
	
	//Uma pessoa pode incluir mais de um bem
		@OneToMany(mappedBy = "pessoa", cascade = CascadeType.REMOVE)
		@JsonIgnoreProperties("pessoa")
		private List<BemAgricolaEntity> bem;

	public long getCodigoPessoa() {
		return codigoPessoa;
	}

	public void setCodigoPessoa(long codigoPessoa) {
		this.codigoPessoa = codigoPessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	//Código de bem é um relacionamento de 1 código para várias pessoas, vai ter q criar outra tabela
	}
