package com.itau.carambola_lyra.bemAgricola.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_propriedade")
public class PropriedadeEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigoPropriedade;

	@NotNull
	private String nome;

	@NotNull
	private String endereco;

	@NotNull
	private String bairro;

	@NotNull
	@Size(max = 8)
	private int CEP;

	@NotNull
	private int numero;

	private String complemento;
	
	@NotNull
	private String cidade;

	@NotNull
	private String UF;
	
	//Várias propriedades podem ter uma pessoa!
	//@ManyToOne
	//@JsonIgnoreProperties("propriedades")
	//private PessoaEntity pessoa;
	
	@ManyToOne
	@JsonIgnoreProperties("bem")
	private BemAgricolaEntity bem;
	
	public int getCodigoPropriedade() {
		return codigoPropriedade;
	}

	public void setCodigoPropriedade(int codigoPropriedade) {
		this.codigoPropriedade = codigoPropriedade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public int getCEP() {
		return CEP;
	}

	public void setCEP(int cEP) {
		CEP = cEP;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUF() {
		return UF;
	}

	public void setUF(String uF) {
		UF = uF;
	}

}