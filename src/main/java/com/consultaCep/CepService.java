package com.consultaCep;

import java.util.List;
import java.util.Optional;

public class CepService  implements CepRepository{
	 private CepRepository cepRepository;
	 
	 
	public CepService(CepRepository cepRepository) {
		super();
		this.cepRepository = cepRepository;
	}


	@Override
	public List<ConsultaCep> findByCep(String cep) {
		
		return null;
	}
	

	@Override
	public ConsultaCep findByRua(String rua) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConsultaCep findByCidade(String cidade) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConsultaCep findByEstado(String estado) {
		// TODO Auto-generated method stub
		return null;
	}

// instancia do id 	
	@Override
	public ConsultaCep findById(long id) {
		ConsultaCep cep = null;
		cep=cepRepository.findById(id);
		return cep;
	}
	
		

	@Override
	public <S extends ConsultaCep> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends ConsultaCep> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<ConsultaCep> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<ConsultaCep> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<ConsultaCep> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(ConsultaCep entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends ConsultaCep> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	
	

}
