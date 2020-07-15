package com.vindixit.foton.supporttables.bos;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import com.vindixit.foton.supporttables.exception.BDException;
import com.vindixit.foton.supporttables.vos.CidadeVO;

public interface ICidadeBO {
	
	public CidadeVO cadastraCidade(CidadeVO cidade) throws BDException;

}
