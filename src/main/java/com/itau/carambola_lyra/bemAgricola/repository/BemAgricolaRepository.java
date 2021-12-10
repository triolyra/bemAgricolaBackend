package com.itau.carambola_lyra.bemAgricola.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itau.carambola_lyra.bemAgricola.entity.BemAgricolaEntity;


@Repository
public interface BemAgricolaRepository extends JpaRepository<BemAgricolaEntity, String>{

	public List<BemAgricolaEntity> findAllByQuantidadeContainingIgnoreCase(String quantidade);
}
