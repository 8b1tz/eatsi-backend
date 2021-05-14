package br.com.ifpb.ya.eatsi.model;

import javax.persistence.Embeddable;

@Embeddable
public class Endereco {
	private String cep;
	private int numero_do_local;
	
	public Endereco(String cep, int numero_do_local) {
		this.cep = cep;
		this.numero_do_local = numero_do_local;
	}
	
	public Endereco() {

	}
	
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public int getNumero_do_local() {
		return numero_do_local;
	}
	public void setNumero_do_local(int numero_do_local) {
		this.numero_do_local = numero_do_local;
	}
	
	
}
