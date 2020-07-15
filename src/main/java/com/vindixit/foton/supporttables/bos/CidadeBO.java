package com.vindixit.foton.supporttables.bos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.vindixit.foton.supporttables.domains.Cidade;
import com.vindixit.foton.supporttables.exception.BDException;
import com.vindixit.foton.supporttables.repositories.CidadeRepository;
import com.vindixit.foton.supporttables.util.TransformeCidade;
import com.vindixit.foton.supporttables.vos.CidadeVO;

public class CidadeBO implements ICidadeBO{
	
	@Autowired
	CidadeRepository cidadeRepository;
	
	@Autowired
	TransformeCidade transformeCidade;

	@Override
	public CidadeVO cadastraCidade(CidadeVO cidade) throws BDException {
	
		Cidade cidadeRetornoPersit = cidadeRepository.save(transformeCidade.transformaCidade(cidade));	
		
		return transformeCidade.transformaCidadeVo(cidadeRetornoPersit);
	}

}
