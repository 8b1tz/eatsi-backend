package br.com.ifpb.ya.eatsi.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "pedido")
public class Pedido {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Date datahora;
	private double preco_total;
	@ManyToMany(mappedBy = "pedidos")
	private List<Produto> produtos;
	@ManyToOne(fetch = FetchType.EAGER, optional=false)
	private Restaurante restaurante;
	private String status;
	@ManyToOne(fetch = FetchType.EAGER, optional=false)
	private Usuario usuario;

	public Pedido(Date datahora,  double preco_total, Restaurante restaurante,
			String status, Usuario usuario) {

		this.datahora = datahora;
		this.preco_total = preco_total;
		this.restaurante = restaurante;
		this.status = status;
		this.usuario = usuario;
	}
	
	public Pedido() {

	}


	public Long getId() {
		return id;
	}

	public Date getDatahora() {
		return datahora;
	}

	public void setDatahora(Date datahora) {
		this.datahora = datahora;
	}

	public double getPreco_total() {
		return preco_total;
	}

	public void setPreco_total(double preco_total) {
		this.preco_total = preco_total;
	}

	public List<Long> getProdutos() {
		List<Long> lista = new ArrayList<Long>();
		
		for (Produto p : produtos) {
			lista.add(p.getId());
		}

		return lista;
	}

	

	public Restaurante getRestaurante() {
		return restaurante;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Usuario getUsuario() {
		return usuario;
	}

}
