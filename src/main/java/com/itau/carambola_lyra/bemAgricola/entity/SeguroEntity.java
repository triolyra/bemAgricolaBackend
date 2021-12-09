package com.itau.carambola_lyra.bemAgricola.entity;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class SeguroEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigoSeguro;
	
	@NotNull
	private String numApolice;
	
	@NotNull
	@Size(max= 14)
	private int cnpjSeguradora;
	
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataInicio = new java.sql.Date(System.currentTimeMillis());
	

	@NotNull
	private Date dataFimAvaliacao;


	public long getCodigoSeguro() {
		return codigoSeguro;
	}


	public void setCodigoSeguro(long codigoSeguro) {
		this.codigoSeguro = codigoSeguro;
	}


	public String getNumApolice() {
		return numApolice;
	}


	public void setNumApolice(String numApolice) {
		this.numApolice = numApolice;
	}


	public int getCnpjSeguradora() {
		return cnpjSeguradora;
	}


	public void setCnpjSeguradora(int cnpjSeguradora) {
		this.cnpjSeguradora = cnpjSeguradora;
	}


	public Date getDataInicio() {
		return dataInicio;
	}


	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}


	public Date getDataFimAvaliacao() {
		return dataFimAvaliacao;
	}


	public void setDataFimAvaliacao(Date dataFimAvaliacao) {
		this.dataFimAvaliacao = dataFimAvaliacao;
	}
	
	}