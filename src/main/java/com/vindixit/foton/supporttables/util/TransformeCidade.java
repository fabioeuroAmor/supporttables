package com.vindixit.foton.supporttables.util;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.vindixit.foton.supporttables.domains.Cidade;
import com.vindixit.foton.supporttables.exception.BDException;
import com.vindixit.foton.supporttables.vos.CidadeVO;

@Component("transformeCidade")
public class TransformeCidade {
	
	
	public CidadeVO transformaCidadeVo (Cidade cidade) {		
		CidadeVO cidadeVO = new CidadeVO();
		cidadeVO.setIdCidade(cidade.getIdCidade());
		cidadeVO.setDcNome(cidade.getDcNome());
		cidadeVO.setDcTemperatura(cidade.getDcTemperatura());
		cidadeVO.setV10m(cidade.getV10m());
		return cidadeVO;		
	}
	
	
	public Cidade transformaCidade (CidadeVO cidadeVO) {
		Cidade cidade = new Cidade();
		cidade.setIdCidade(cidadeVO.getIdCidade());
		cidade.setDcNome(cidadeVO.getDcNome());
		cidade.setV10m(cidadeVO.getDcTemperatura());
		cidade.setDcTemperatura(cidadeVO.getDcTemperatura());		
		return cidade;
		
	}

}
