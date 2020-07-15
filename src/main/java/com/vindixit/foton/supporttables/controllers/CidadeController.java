package com.vindixit.foton.supporttables.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.vindixit.foton.supporttables.bos.CidadeBO;
import com.vindixit.foton.supporttables.exception.BDException;
import com.vindixit.foton.supporttables.vos.CidadeVO;
import com.vindixit.foton.supporttables.vos.RetornoVO;



@RestController
@RequestMapping("/api/supporttables/v1")
@Configuration
@ComponentScan("com.vindixit.foton.supporttables")
public class CidadeController implements ICidadeController{
	
	@Autowired
	CidadeBO cidadeBO = null;

	@Override
	@RequestMapping(value = "/cidade/cadastro", method =  RequestMethod.POST)
	public ResponseEntity<RetornoVO> cadastraCidade(@RequestParam String nomeCidade, @RequestParam String v10m,@RequestParam String temperatura) throws BDException {
		
		CidadeVO cidadeVO = new CidadeVO();
		RetornoVO retornoVO = new RetornoVO();
		try {
			cidadeVO.setDcNome(nomeCidade);	
			cidadeVO.setV10m(new Double(v10m));
			cidadeVO.setDcTemperatura(new Double(temperatura));
			//cidadeBO = new CidadeBO();
			retornoVO.setModeloRetorno(cidadeBO.cadastraCidade(cidadeVO));
			retornoVO.setMensagensRetorno("Cadastro realizado com sucesso!!!");
			
		} catch (Exception e) {
			retornoVO.setMensagensRetorno(e.getMessage());
			//logger.error("Erro ao consultar o serviço: api/votacao/pauta/{nomePauta} => " + e.getMessage());
		}
		
		
		return ResponseEntity.ok(retornoVO);
	}

}
