package com.vindixit.foton.supporttables.bos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.vindixit.foton.supporttables.domains.Cidade;
import com.vindixit.foton.supporttables.exception.BDException;
import com.vindixit.foton.supporttables.repositories.CidadeRepository;
import com.vindixit.foton.supporttables.util.TransformeCidade;
import com.vindixit.foton.supporttables.vos.CidadeVO;


@Component("cidadeBO")
@Configuration
@ComponentScan("com.vindixit.foton.supporttables")
public class CidadeBO implements ICidadeBO{
	
	@Autowired
	CidadeRepository cidadeRepository;
	
	@Autowired
	TransformeCidade transformeCidade;

	@Override
	public CidadeVO cadastraCidade(CidadeVO cidade) throws BDException {
	
		Cidade cidadeRetornoPersit = null;
		try {
			 cidadeRetornoPersit = cidadeRepository.save(transformeCidade.transformaCidade(cidade));	
		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
		}
		
		
		return transformeCidade.transformaCidadeVo(cidadeRetornoPersit);
	}

}
