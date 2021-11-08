package com.consultaCep;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CepRepository extends CrudRepository<ConsultaCep,Long > {
	List<ConsultaCep> findByCep(String cep);
	/*ConsultaCep findByRua(String rua);
	ConsultaCep findByCidade( String cidade);
	ConsultaCep findByEstado( String estado );
	*/
	ConsultaCep findById(long id);
	

}
