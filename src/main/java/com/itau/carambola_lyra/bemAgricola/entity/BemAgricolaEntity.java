package com.itau.carambola_lyra.bemAgricola.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_bemAgricola")

public class BemAgricolaEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String codigoBem;

	@NotNull
	private String tipoAgricola;

	@NotNull
	private String funcionalUsuario;

	@NotNull
	private int safra;

	@NotNull
	private String quantidade;

	@NotNull
	private boolean colheita;

	@NotNull
	private String unidadeMedida;

	@NotNull
	private String tipoMoeda;

	@NotNull
	private double valor;

	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataInclusao = new java.sql.Date(System.currentTimeMillis());

	@NotNull
	private Date dataAvaliacao;

	public String getCodigoBem() {
		return codigoBem;
	}

	public void setCodigoBem(String codigoBem) {
		this.codigoBem = codigoBem;
	}

	public String getTipoAgricola() {
		return tipoAgricola;
	}

	public void setTipoAgricola(String tipoAgricola) {
		this.tipoAgricola = tipoAgricola;
	}

	public String getFuncionalUsuario() {
		return funcionalUsuario;
	}

	public void setFuncionalUsuario(String funcionalUsuario) {
		this.funcionalUsuario = funcionalUsuario;
	}

	public int getSafra() {
		return safra;
	}

	public void setSafra(int safra) {
		this.safra = safra;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

	public boolean isColheita() {
		return colheita;
	}

	public void setColheita(boolean colheita) {
		this.colheita = colheita;
	}

	public String getUnidadeMedida() {
		return unidadeMedida;
	}

	public void setUnidadeMedida(String unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}

	public String getTipoMoeda() {
		return tipoMoeda;
	}

	public void setTipoMoeda(String tipoMoeda) {
		this.tipoMoeda = tipoMoeda;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Date getDataInclusao() {
		return dataInclusao;
	}

	public void setDataInclusao(Date dataInclusao) {
		this.dataInclusao = dataInclusao;
	}

	public Date getDataAvaliacao() {
		return dataAvaliacao;
	}

	public void setDataAvaliacao(Date dataAvaliacao) {
		this.dataAvaliacao = dataAvaliacao;
	}

}
