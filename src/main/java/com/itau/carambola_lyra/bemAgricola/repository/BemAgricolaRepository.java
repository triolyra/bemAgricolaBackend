package com.itau.carambola_lyra.bemAgricola.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itau.carambola_lyra.bemAgricola.entity.BemAgricola;

@Repository
public interface BemAgricolaRepository extends JpaRepository<BemAgricola, String>
{
}
