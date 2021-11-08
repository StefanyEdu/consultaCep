package com.consultaCep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(exposedHeaders = "errors, content-type")
@RequestMapping("/api/ceps")
public class CepController {
	
	@Autowired
	private CepRepository cepRepository;


    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public ConsultaCep getCep(@PathVariable("id") long id) {

         ConsultaCep cep = this.cepRepository.findById(id);
         return cep;
    }
    
         
	//Qual o metodo devo retornar para impressão na tela 
	
	/*@RequestMapping("/api")
	public ConsultaCep findByCep(@PathVariable("cep")String cep) {
		ConsultaCep consulta = this.CepRepository.findByCep(cep);
		return consulta;*/ 
		
	
	}
	
	


