package br.com.ifpb.ya.eatsi.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "restaurante")
public class Restaurante {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String cnpj;
	private String nome;
	private String imagem;
	private Integer nota;
	private String descricao;
	private String telefone;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "endereco_id", referencedColumnName = "id")
	private Endereco endereco;

	@OneToMany(mappedBy = "restaurante")	
	private List<Produto> produtos;
	@OneToMany(mappedBy = "restaurante")
	private List<Pedido> pedidos;

	public Restaurante(String cnpj, String nome, Integer nota, String descricao, String telefone, String cep,
			int numero_do_local, String imagem) {
		this.cnpj = cnpj;
		this.nome = nome;
		this.nota = nota;
		this.descricao = descricao;
		this.telefone = telefone;
		this.endereco = new Endereco(cep, numero_do_local);
		this.imagem = imagem;
	}
	
	public Restaurante() {}
	
	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public Long getId() {
		return id;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getNota() {
		return nota;
	}

	public void setNota(Integer nota) {
		this.nota = nota;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public List<Long> getProdutos() {
		List<Long> lista = new ArrayList<Long>();
		
		for (Produto p : produtos) {
			lista.add(p.getId());
		}

		return lista;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	

}