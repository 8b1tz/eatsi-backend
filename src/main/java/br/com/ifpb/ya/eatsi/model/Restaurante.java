package br.com.ifpb.ya.eatsi.model;

import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "restaurante")
public class Restaurante {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String cnpj;
	private String nome;
	private Integer nota;
	private String descricao;
	private String telefone;
	@Embedded
	private Endereco endereco;
	@OneToMany(mappedBy = "restaurante")
	private List<Produto> produtos;
	@OneToMany(mappedBy = "restaurante")
	private List<Pedido> pedidos;

	public Restaurante(String cnpj, String nome, Integer nota, String descricao, String telefone, String cpf,
			int numero_do_local) {
		this.cnpj = cnpj;
		this.nome = nome;
		this.nota = nota;
		this.descricao = descricao;
		this.telefone = telefone;
		this.endereco = new Endereco(cpf, numero_do_local);

	}
	
	public Restaurante() {

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

	public List<Produto> getProdutos() {
		return produtos;
	}

}
