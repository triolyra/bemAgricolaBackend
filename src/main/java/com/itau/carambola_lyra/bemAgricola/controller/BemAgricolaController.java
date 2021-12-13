package com.itau.carambola_lyra.bemAgricola.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itau.carambola_lyra.bemAgricola.entity.BemAgricola;
import com.itau.carambola_lyra.bemAgricola.repository.BemAgricolaRepository;
import com.itau.carambola_lyra.bemAgricola.service.BemAgricolaService;

@RestController
@RequestMapping ("/cadastro")
@CrossOrigin ("*")
public class BemAgricolaController {

	@Autowired
	private BemAgricolaRepository repositoryBemAgricola;

	@Autowired
	private BemAgricolaService serviceBemAgricola;

	

	@PostMapping
	public ResponseEntity<BemAgricola> post(@RequestBody BemAgricola cadastroBem) {

		serviceBemAgricola.post(cadastroBem);
		return ResponseEntity.status(HttpStatus.CREATED).body(repositoryBemAgricola.save(cadastroBem));
	};

	
}
