package com.itau.carambola_lyra.bemAgricola.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itau.carambola_lyra.bemAgricola.entity.PropriedadeEntity;
import com.itau.carambola_lyra.bemAgricola.repository.PropriedadeRepository;

@RequestMapping ("/")
@RestController
public class BemAgricolaController {

	@Autowired
	private PropriedadeRepository propriedadeRepository;


	@PostMapping
	public ResponseEntity <PropriedadeEntity> postPropriedade(@RequestBody PropriedadeEntity propriedadeEntity){
		propriedadeRepository.save(propriedadeEntity);
		return ResponseEntity.status(200).body(propriedadeEntity);
	}

}


