package com.itau.carambola_lyra.bemAgricola.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_bemAgricola")
public class BemAgricolaEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private String codigoBem;

	@NotNull
	private String codigoTipoBem;

	@NotNull
	private String funcional;

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

	
	@ManyToOne
	@JsonIgnoreProperties("seguro")
	private SeguroEntity seguro;
	
	@ManyToOne
	@JsonIgnoreProperties("pessoa")
	private PessoaEntity pessoa;
	
	@ManyToOne
	@JsonIgnoreProperties("propriedade")
	private PropriedadeEntity propriedade;

	public long getCodigoBem() {
		return codigoBem;
	}

	public void setCodigoBem(long codigoBem) {

		this.codigoBem = codigoBem;
	}

	public String getCodigoTipoBem() {
		return codigoTipoBem;
	}

	public void setCodigoTipoBem(String codigoTipoBem) {
		this.codigoTipoBem = codigoTipoBem;
	}

	public String getFuncional() {
		return funcional;
	}

	public void setFuncional(String funcional) {
		this.funcional = funcional;
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

	public SeguroEntity getSeguro() {
		return seguro;
	}

	public void setSeguro(SeguroEntity seguro) {
		this.seguro = seguro;
	}

	public PessoaEntity getPessoa() {
		return pessoa;
	}

	public void setPessoa(PessoaEntity pessoa) {
		this.pessoa = pessoa;
	}

	public PropriedadeEntity getPropriedade() {
		return propriedade;
	}

	public void setPropriedade(PropriedadeEntity propriedade) {
		this.propriedade = propriedade;
	}
	
}
