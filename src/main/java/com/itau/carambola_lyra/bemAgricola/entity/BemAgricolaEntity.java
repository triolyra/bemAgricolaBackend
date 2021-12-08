package com.itau.carambola_lyra.bemAgricola.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

		@Entity
		@Table(name = "bemAgricola")
	
		public class BemAgricolaEntity {

			@Id
			@GeneratedValue(strategy = GenerationType.IDENTITY)
			private int codigoBem;

			private String tipoAgricola;

			private String funcionalUsuario;

			private int safra;

			private String quantidade;
			
			private boolean colheita;

			private String unidadeMedida;
			
			private String tipoMoeda;
			
			private double valor;

			@Temporal(TemporalType.TIMESTAMP)
			private Date dataInclusao = new java.sql.Date(System.currentTimeMillis());

		
			private Date dataAvaliacao;
			

}
