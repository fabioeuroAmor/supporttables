package com.vindixit.foton.supporttables.bos;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import com.vindixit.foton.supporttables.exception.BDException;
import com.vindixit.foton.supporttables.vos.CidadeVO;
import com.vindixit.foton.supporttables.vos.RetornoVO;

public interface ICidadeBO {
	
	public CidadeVO cadastraCidade(CidadeVO cidade) throws BDException;
	
	public void deleteTodasCidades() throws BDException;	
	
	public ArrayList<CidadeVO> buscaTodasCidades() throws BDException;

}
