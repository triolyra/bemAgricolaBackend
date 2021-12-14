package com.itau.carambola_lyra.bemAgricola.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.itau.carambola_lyra.bemAgricola.entity.BemAgricolaEntity;

import com.itau.carambola_lyra.bemAgricola.repository.BemAgricolaRepository;
import com.itau.carambola_lyra.bemAgricola.usecase.CadastrarUseCase;

@Service
public class BemAgricolaService {

	@Autowired
	private BemAgricolaRepository repositoryBemAgricola;

	

	public Optional<Object> cadastrarCodigo(CadastrarUseCase novoCadastro) {
		return null;


}

	public void post(BemAgricolaEntity cadastroBem) {
		// TODO Auto-generated method stub
		
	}

}
	
//	private CadastrarUseCase cadastrarUseCase;
//
//	public static void main(String[] args) {
//
//		CadastrarUseCase cadastrarUseCase = CadastrarUseCase();
//		cadastrarUseCase.cadastrarBemAgricola(cadastrarUseCase);
//
//	}
//
//	private static CadastrarUseCase CadastrarUseCase() {
//		// TODO Auto-generated method stub
//		return null;
	