package com.itau.carambola_lyra.bemAgricola.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name = "tb_Propriedade")

public class PropriedadeEntity {


private int codigoBem;

@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)

private int codigoPropriedade;

private String nome;

private String endereco;

private String bairro;

private int CEP;

private int numero;

private String complemento;

private String cidade;

private String UF;


public int getCodigoBem() {
	return codigoBem;
}

public void setCodigoBem(int codigoBem) {
	this.codigoBem = codigoBem;
}

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


