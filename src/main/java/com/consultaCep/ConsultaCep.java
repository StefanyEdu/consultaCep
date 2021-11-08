package com.consultaCep;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ConsultaCep {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String localidade;
	private String bairro;
	private String   logradouro;
	private String cep;
	
	protected ConsultaCep() {}

	public ConsultaCep( String localidade, String bairro, String logradouro, String cep) {
		
		
		this.localidade = localidade;
		this.bairro = bairro;
		this.logradouro = logradouro;
		this.cep = cep;
	}

	public long getId() {
		return id;
	}

	public String getLocalidade() {
		return localidade;
	}

	public String getBairro() {
		return bairro;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public String getCep() {
		return cep;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	@Override
	public String toString() {
		return "ConsultaCep [id=" + id + ", localidade=" + localidade + ", bairro=" + bairro + ", logradouro="
				+ logradouro + ", cep=" + cep + "]";
	}
	
}