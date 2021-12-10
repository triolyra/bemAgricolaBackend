package com.itau.carambola_lyra.bemAgricola.usecase;

import com.itau.carambola_lyra.bemAgricola.entity.BemAgricolaEntity;
import com.itau.carambola_lyra.bemAgricola.repository.BemAgricolaRepository;

public class CadastrarUseCase {

	private BemAgricolaRepository repository;
	
	public BemAgricolaEntity cadastrarBemAgricola(BemAgricolaEntity bemAgricola) {
		return repository.save(bemAgricola);
		
	}

}
