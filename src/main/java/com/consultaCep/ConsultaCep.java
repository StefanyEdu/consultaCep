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
	private String cidade;
	private String estado;
	private String rua;
	private String cep;
	
	protected ConsultaCep() {}
    public ConsultaCep(String cep ,String rua ,String cidade, String estado ) {
    	this.cidade=cidade;
    	this.estado=estado;
    	this.rua= rua;
    	this.cep=cep;
    }
    
    @Override
    public String toString() {
    	return String.format("Consulta CEP[id=%d, cep='%s',rua='%s', cidade='%s',estado='%s']",id, cep,rua,cidade,estado);
    }
	
	public long getId() {
		return id;
	}

	public String getCidade() {
		return cidade;
	}

	public String getEstado() {
		return estado;
	}

	public String getRua() {
		return rua;
	}

	public String getCep() {
		return cep;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	
	
	

}
