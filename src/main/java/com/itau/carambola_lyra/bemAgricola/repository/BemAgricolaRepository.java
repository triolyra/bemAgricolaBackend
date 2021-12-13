package com.itau.carambola_lyra.bemAgricola.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.itau.carambola_lyra.bemAgricola.entity.BemAgricola;
@Repository
public interface BemAgricolaRepository extends JpaRepository<BemAgricola, String>
{

	public Optional<BemAgricola> findAllById(String codigoBem);
	
	public List<BemAgricola> findAllTipoAgricola(String tipoAgricola);
}
