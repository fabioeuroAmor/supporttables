package com.vindixit.foton.supporttables.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.vindixit.foton.supporttables.exception.BDException;
import com.vindixit.foton.supporttables.vos.CidadeVO;
import com.vindixit.foton.supporttables.vos.RetornoVO;

public interface ICidadeController {
	
	
	 public ResponseEntity<RetornoVO> cadastraCidade(@RequestParam String nomeCidade, @RequestParam String v10m, @RequestParam String temperatura) throws BDException;
	 
	 public ResponseEntity<RetornoVO> deleteTodasCidades() throws BDException;
	 
	 public ResponseEntity<RetornoVO> buscaTodasCidades() throws BDException;

}
