package com.itau.carambola_lyra.bemAgricola.repository;
import com.itau.carambola_lyra.bemAgricola.entity.PropriedadeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropriedadeRepository extends JpaRepository<PropriedadeEntity, Long> { 


	
}
